package sources;


public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public void walk(){
        System.out.println("I'm an animal walking in "+legs+" legs");
    }

    public abstract void eat();

}
