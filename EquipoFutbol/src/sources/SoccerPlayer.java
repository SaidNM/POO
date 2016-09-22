
package sources;


public class SoccerPlayer {
    private String name;
    private int age;
    private int number;
    private String position;
    private String nationality;
    private double height;
    private double weight;

    public SoccerPlayer(String name, int age, int number, String position, String nationality, double height, double weight) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.position = position;
        this.nationality = nationality;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nSoccerPlayer\n" 
                + "\tname=" + name + "\n\tage=" + age + "\n\tnumber=" + number + "\n\tposition=" +
                position + "\n\tnationality=" + nationality + "\n\theight(cm)=" + height + "\n\tweight=" + weight;
    }
    
    
}
