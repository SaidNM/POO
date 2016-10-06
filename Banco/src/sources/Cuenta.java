
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
        if (monto>0){
        this.saldo+=monto;
        }
    }
    public void retirar(double monto){
        if(monto<=saldo){
    this.saldo=this.saldo-monto;
    }
    }    
}
