package sources;


public class Fish extends Animal implements Pet{
    private String name;

    public Fish(String name) {
        super(0);
        this.name=name;
    }

    public Fish(){
        this("");

    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
    this.name=name;
    }

    @Override
    public void play() {
        System.out.println("I'm playing...Blop blop blop....");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating fish");
    }
}


