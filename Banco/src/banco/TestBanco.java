
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
        
        
        
        Cliente c2 = new Cliente("Tona");
        Cuenta cu2 = new Cuenta(454545);
        c2.setNumCuenta("9876DER");
        c2.setCuenta(cu2);
        banamex.agregarCliente(c2.getNombre(),c2.getNumCuenta(),cu2);
        
        Cliente c3 = new Cliente("Ian");
        Cuenta cu3 = new Cuenta(15623);
        c3.setNumCuenta("10909090");
        c3.setCuenta(cu3);
         banamex.agregarCliente(c3.getNombre(),c3.getNumCuenta(),cu3);
        
         Cliente c4 = new Cliente("Aiko");
        Cuenta cu4 = new Cuenta(600);
        c4.setNumCuenta("17623634");
        c4.setCuenta(cu4);
         banamex.agregarCliente(c4.getNombre(),c4.getNumCuenta(),cu4);
        
         Cliente c5 = new Cliente("Jugador");
        Cuenta cu5 = new Cuenta(556748.452);
        c5.setNumCuenta("76723236273");
        c5.setCuenta(cu5);
        banamex.agregarCliente(c5.getNombre(),c5.getNumCuenta(),cu5);
        
        
        banamex.imprimir();
        
        
        c5.getCuenta().depositar(500.10);
        System.out.println("Nuevo deposito del cliente "+c5.getNombre()+"\n\tSaldo actual: "+c5.getCuenta().consultar());
        
        c2.getCuenta().retirar(5000);
        System.out.println("Retiro del cliente "+c2.getNombre()+"\n\tSaldo actual: "+c2.getCuenta().consultar());
        
    }
    
}
