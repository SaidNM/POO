package fuentes;


public class Equipo {
    private Jugador[] jugadores;
    private String nombre;
    private int index;

    public Equipo(String nombre) {
        this.nombre = nombre;
        jugadores = new Jugador[3]; //llena de null
        index=-1;
    }
    

    @Override
    public String toString() {
    String temp = "Nombre: "+ nombre;
        for (int i = 0; i <= index; i++) {
            temp+="\nJugador "+(i+1)+": "+this.jugadores[i].toString();
        }
    return temp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarJugador(Jugador j1){
        if(index<jugadores.length-1){
            this.jugadores[++index]=j1;
            
        }
        else{
            System.out.println("Equipo lleno");
        }
    }
    
    public void quitarElemento(){
    
    }
   
}
 