 
package model;


public class Teams {

    private int teamID;
    private String teamName;
    private String sport;
    private int firstYear;
    private int championships;
    private String coach;
    
    public Teams() {
        this.teamID = 0;
        this.teamName = "";
        this.sport = "";
        this.firstYear = 0;
        this.championships = 0;
        this.coach = "";
    }

    public Teams(int teamID, String teamName, String sport, int firstYear, int championships, String coach) {
        this.teamID = teamID;
        this.teamName = teamName;
        this.sport = sport;
        this.firstYear = firstYear;
        this.championships = championships;
        this.coach = coach;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getFirstYear() {
        return firstYear;
    }

    public void setFirstYear(int firstYear) {
        this.firstYear = firstYear;
    }

    public int getChampionships() {
        return championships;
    }

    public void setChampionships(int championships) {
        this.championships = championships;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    @Override
    public String toString() {
        return "Teams{" + "teamID=" + teamID + ", teamName=" + teamName + ", sport=" + sport + ", firstYear=" + firstYear + ", championships=" + championships + ", coach=" + coach + '}';
    }
    
}
