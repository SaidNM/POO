
package fuentes;


public class person {

 
    private String name;
    private int age;
    private int energyLevel;
    private float weight;
    
     public person(String name, int age) {
        this.name = name;
        this.age = age;
        energyLevel=50;
        weight=60.0f;
        
    }
        public int getEnergyLevel() {
        return energyLevel;
    }

    public float getWeight() {
        return weight;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public void wakeUp(){
        System.out.println("......");
    } 
    public void eat(){
    weight=weight+0.1f;
        System.out.println("Yummy!");
    }
    public void work(){
    energyLevel=energyLevel-20;
    weight=weight-0.3f;
        System.out.println("Chop chop");
    }
    public void goOut(){
    energyLevel=energyLevel-20;
        System.out.println("Party!");
    }
    public void sleep(){
    energyLevel=energyLevel+50;
        System.out.println("ZzZzZzZ");
    }
}
