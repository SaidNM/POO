
package pruebas;

import sources.SoccerPlayer;


public class TestPlayer {

    
    public static void main(String[] args) {
        SoccerPlayer player= new SoccerPlayer("Mario",20,10,"Defensa","Argentina",170,60.3);
        System.out.println(""+player);
        player.setAge(18);
        player.setHeight(150);
        player.setName("Chicharito");
        player.setNationality("Mexicana");
        player.setNumber(14);
        player.setPosition("Portero");
        player.setWeight(45.3);
        System.out.println(""+player);
        
}

}