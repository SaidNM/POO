
package banco;

import sources.Banco;
import sources.Cliente;
import sources.Cuenta;

public class TestBanco {

    
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Ivan");
        c1.setNumCuenta("15642ABC");
        Cuenta micuenta = new Cuenta(50000);
        Banco banamex = new Banco();
        banamex.agregarCliente(c1.getNombre(),c1.getNumCuenta(),micuenta);
        banamex.imprimir();
        
        
    }
    
}
