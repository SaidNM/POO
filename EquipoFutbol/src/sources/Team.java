
package sources;

import java.util.ArrayList;


public class Team {
   private ArrayList<SoccerPlayer> team;

    public Team() {
        team=new ArrayList <>();
        
    }

    public ArrayList<SoccerPlayer> getTeam() {
        return team;
    }
   public void AddPlayer(SoccerPlayer player){
   team.add(player);
   
   }
    public void serchbyPosition(String position){
        for (int i = 0; i < team.size(); i++) {
            if(position.equals(team.get(i).getPosition())){
                System.out.println("\nPlayer: "+team.get(i));
            }
            
        }
    
    }
    
    public void serchbyName(String name){
        for (int i = 0; i < team.size(); i++) {
            if(name.equals(team.get(i).getName())){
                System.out.println("\nPlayer: "+team.get(i));
            }
            
        }
    }
    
    public void serchbyNationality(String nationality){
        for (int i = 0; i < team.size(); i++) {
            if(nationality.equals(team.get(i).getNationality())){
            System.out.println("\nPlayer: "+team.get(i));
            }
        }
    }
    
}
