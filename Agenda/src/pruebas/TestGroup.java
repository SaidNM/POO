
package pruebas;

import fuentes.Group;
import fuentes.person;

public class TestGroup {
    public static void main(String[] args){
    person p=new person("Jefferson",21);
    Group g= new Group();
    g.agregar(p);
    
        for (int i = 0; i < g.getGroup().size(); i++) {
            System.out.println(""+g.getGroup().get(i).getWeight());
            
        }
            
    
    
    }
    
}
