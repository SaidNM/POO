
package testVolador;

import sources.Ave;
import sources.El_Santo;


public class Test {

    
    public static void main(String[] args) {
    Ave pajaro =new Ave("Pajaro");
    pajaro.ponerHuevo();
        System.out.println("Tengo "+pajaro.ponerHuevo()+" huevos");
        pajaro.empollar();
        System.out.println(""+pajaro.despegar());
        pajaro.procrear();
        pajaro.chocar();
        pajaro.recuperar();
        System.out.println("-------------------------------------------------");
    El_Santo santo = new El_Santo(true,false);
    santo.actuacion();
        System.out.println("Gane "+santo.ganarDinero());
        System.out.println("ya mate "+santo.matarMomiasGto() + " momias");
        System.out.println(""+santo.despegar());
        System.out.println(""+santo.volar());
        System.out.println(""+santo.aterrizar());
        santo.chocar();
        santo.recuperar();
    }
    
}
