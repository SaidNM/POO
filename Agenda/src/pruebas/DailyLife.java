
package pruebas;

import fuentes.person;


public class DailyLife {


    public static void main(String[] args) {
        
        person person=new person("Steffen",31);
        person.wakeUp();
        person.eat();
        person.work();
        person.eat();
        person.goOut();
        person.sleep();
        
        System.out.println("Current energy level: "+person.getEnergyLevel());
        System.out.println("Current weight: "+person.getWeight());
        
        
        
        
        
    }
    
}
