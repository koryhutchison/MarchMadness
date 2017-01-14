/*
This is the subclass and it inherits from the Team class. It has the attribute of 
status. 
*/
/**
 *
 * @author Kory Hutchison
 */
public class BasketballTeam extends Team{
    String status;
    
    BasketballTeam(String sTeamName)
    {
        super(sTeamName);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
