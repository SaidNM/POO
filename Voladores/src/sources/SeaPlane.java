
package sources;


public  class SeaPlane extends Airplane{

    @Override
    public void takeoff() {
        System.out.println("Turbines Advancing then Taking off ...");
    }

    @Override
    public void land() {
        System.out.println("Land then Advance ...");
    }

    
    
}
