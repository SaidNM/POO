
package pruebas;

import sources.SoccerPlayer;
import sources.Team;


public class TestTeam {
     public static void main(String[] args) {
        Team team=new Team();
        SoccerPlayer player=new SoccerPlayer("Mario",20,10,"Defensa","Argentina",170,60.3);
        SoccerPlayer player1=new SoccerPlayer("Luis",50,0,"Portero","Mexicano",160,50.7);
        SoccerPlayer player2=new SoccerPlayer("Jorge",18,7,"Delantero","Italiana",170,68.2);
        
        team.AddPlayer(player);
        team.AddPlayer(player1);
        team.AddPlayer(player2);
        
        team.serchbyPosition("Delantero");
        team.serchbyNationality("Argentina");
        team.serchbyName("Luis");
        
    }
}
