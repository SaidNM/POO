package pruebas;

import fuentes.Equipo;
import fuentes.Jugador;


public class PruebaEquipo {
    public static void main(String[] args) {
        Equipo e1=new Equipo("PSG");
        System.out.println("Equipo1: "+ e1);
   
        e1.setNombre("FC Politecnico");
        System.out.println("Equipo:"+ e1.getNombre());
        
        Jugador j1=new Jugador("Chichadios",25,14,"Delantero");
        //e1.agregarJugador(new Jugador("Chichadios",25,14,"Delantero");
        e1.agregarJugador(j1);
        e1.agregarJugador(new Jugador("Pogba",23,10,"Medio"));
        
        System.out.println("Equipo1:"+e1);
    }
}
