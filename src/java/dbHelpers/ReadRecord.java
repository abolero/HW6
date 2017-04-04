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

public class ReadRecord {
    
    private Connection conn;
    private ResultSet results;
    
    private Teams team = new Teams();
    private int teamID;
    
    public ReadRecord(int teamID){
    
        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        
        this.teamID = teamID;
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void doRead() {
        
        try {
            String query = "SELECT * FROM teams WHERE teamID = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setInt(1, teamID);
            
            this.results = ps.executeQuery();
            
            this.results.next();
            
            team.setTeamID(this.results.getInt("teamID"));
            team.setTeamName(this.results.getString("teamName"));
            team.setSport(this.results.getString("sport"));
            team.setFirstYear(this.results.getInt("firstYear"));
            team.setChampionships(this.results.getInt("championships"));
            team.setCoach(this.results.getString("coach"));
            
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            
        }
        
    public Teams getTeam(){
        
        return this.team;
        
    }
    
    }
            
    

