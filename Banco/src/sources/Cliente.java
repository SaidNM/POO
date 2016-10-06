package sources;

public class Cliente {
    private String nombre;
    private Cuenta cuenta;
    private String numCuenta;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return "Cliente: " + "\n\tnombre= " + nombre +"\n\tNumero de cuenta: "+ numCuenta + "\n\tSaldo: "+ cuenta.consultar();
    }
    
    
}
