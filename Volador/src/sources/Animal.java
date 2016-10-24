
package sources;


public class Animal {
    public String Especie;

    public Animal(String Especie) {
        this.Especie = Especie;
    }
    
    
    public void nacer(){
        System.out.println("Estoy naciendo y soy "+Especie);
    }
    
    public void crecer(){
        System.out.println("Mira como cresco papu :v");
    }
    
    public void procrear(){
        
        System.out.println("hmm hmmm hmmm ....");
    }
    
    public void morir(){
        System.out.println("Oh! no muero.. X_X ");
    }
}
