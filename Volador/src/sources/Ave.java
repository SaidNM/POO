package sources;


public class Ave extends Animal implements Volador{
public boolean depredador;
public String tipoAlas;
public int numHuevos;

    public Ave(String Especie) {
        super(Especie);
        depredador=false;
        tipoAlas="Largas";    
    }

public int ponerHuevo(){
    return ++numHuevos;
}

public void empollar(){
    System.out.println("Estoy empollando .... :'v");
}

@Override
public String despegar(){
    return "Estoy despegando";
}

@Override
public String volar(){
    
    return "Miren como vuelo swag swag";
}

@Override
public String aterrizar(){
return "Ya me canse ahora aterrizo...shhh";
}

@Override
public void chocar(){
    System.out.println("auch..! creo que choque");
}
// Nombre_interface.super.metodo();         Para llamar a la clase superior
}
