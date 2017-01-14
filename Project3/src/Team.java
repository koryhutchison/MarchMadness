/*
This is the parent class and it contains the attributes of teamName, wins, losses, 
and winLossPct. 
*/

/**
 *
 * @author Kory Hutchison
 */
public class Team {
    protected String teamName;
    protected int wins;
    protected int losses;
    protected double winLossPct;
    
    Team()
    {
        
    }
    
    Team(String teamName)
    {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public double getWinLossPct() {
        return winLossPct;
    }

    public void setWinLossPct(double winLossPct) {
        this.winLossPct = winLossPct;
    }
    
    public void addWins()
    {
        this.wins = this.wins + 1;
    }
    
    public void addLosses()
    {
        this.losses = this.losses + 1;
    }
}
