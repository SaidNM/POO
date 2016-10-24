package sources;


public interface Volador {
    double GRAVEDAD=9.81;
    
    String despegar();
    String volar();
    String aterrizar();
    
    default void chocar(){
        System.out.println("Ups!..pummm..pazzz ..auch..!");
    }
    
    default void recuperar(){
        System.out.println("Despegando de nuevo");
    }
}
