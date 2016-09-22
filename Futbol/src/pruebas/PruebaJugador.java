package pruebas;
import fuentes.Jugador;


public class PruebaJugador {
    public static void main(String[] args) {
        //Creacion del objeto jugador
        Jugador j1;
        j1 = new Jugador("Tato", 19, 9, "Delantero");
        //----
        System.out.println("Jugador 1: " + j1); 
        System.out.println("Jugador 1: \n\tNombre:"+j1.getNombre()+" Edad:"+j1.getEdad()+" Numero:"+j1.getNum()+ " Posicion:"+j1.getPosicion());
        //Se cambia el valor de los campos de la clase Jugador
        j1.setNombre("Chicharito");
        j1.setEdad(25);
        j1.setNum(7);
        j1.setPosicion("Defensa");
        System.out.println("Jugador 1: \n\tNombre:"+j1.getNombre()+" Edad:"+j1.getEdad()+" Numero:"+j1.getNum()+ " Posicion:"+j1.getPosicion());
        
                
        
       
        
                


        
    }
}
