package fuentes;

public class Jugador {
    private String nombre;
    private int edad;
    private int num;
    private String posicion;

    public Jugador(String nombre, int edad, int num, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.num = num;
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", edad=" + edad + ", num=" + num + ", posicion=" + posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNum() {
        return num;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
   
    
    
    
}
