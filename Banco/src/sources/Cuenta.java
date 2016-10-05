
package sources;

public class Cuenta {
    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double consultar() {
        return saldo;
    }
    
   
    public void depositar(double monto){
    this.saldo=this.saldo+monto;
    }
    public void retirar(double monto){
    this.saldo=this.saldo-monto;
    }
    
}
