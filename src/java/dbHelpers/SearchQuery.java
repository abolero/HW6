package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Teams;

public class SearchQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public SearchQuery(){
        
        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void doSearch(String teamName){
        
        try {
            String query = "SELECT * FROM teams WHERE UPPER(teamName) LIKE ? ORDER BY teamID ASC";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, "%" + teamName.toUpperCase() + "%");
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String getHTMLTable() {
        
        String table = "";
        
        table += "<table>";
        
                table += "<th>";
                table += "Team ID";
                table += "</th>";
                
                table += "<th>";
                table += "Team Name";
                table += "</th>";
                
                table += "<th>";
                table += "Sport";
                table += "</th>";
                
                table += "<th>";
                table += "First Year";
                table += "</th>";
                
                table += "<th>";
                table += "Championships";
                table += "</th>";
                
                table += "<th>";
                table += "Coach";
                table += "</th>";
                
                table += "<th>";
                table += "Delete";
                table += "</th>";
        
        try {
            if(!this.results.isBeforeFirst()){
                
                table += "<tr>";
                table += "<td colspan='7' >Sorry, no such team exists in this database</td>";
                table += "</tr>";
            }
            else{
            while(this.results.next()){
                
                Teams team = new Teams();
                team.setTeamID(this.results.getInt("teamID"));
                team.setTeamName(this.results.getString("teamName"));
                team.setSport(this.results.getString("sport"));
                team.setFirstYear(this.results.getInt("firstYear"));
                team.setChampionships(this.results.getInt("championships"));
                team.setCoach(this.results.getString("coach"));
                
                
                table += "<tr>";
                table += "<td>";
                table += team.getTeamID();
                table += "</td>";
                
                table += "<td>";
                table += team.getTeamName();
                table += "</td>";
                
                table += "<td>";
                table += team.getSport();
                table += "</td>";
                
                table += "<td>";
                table += team.getFirstYear();
                table += "</td>";
                
                table += "<td>";
                table += team.getChampionships();
                table += "</td>";
                
                table += "<td>";
                table += team.getCoach();
                table += "</td>";
                
                table += "<td>";
                table += "<a href=update?teamID=" + team.getTeamID() + "> Update </a>" + "<a href=delete?teamID=" + team.getTeamID() + "> Delete </a>";
                table += "</td>";
                
                table += "</tr>";
            }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        table += "</table>";
        
                return table;
        
              
        
    }
    
}
