
package sources;


public class HotelRoom {
    public static enum Type{SINGLE,DOUBLE};
    public Type type;
    private double price;
    private String personName;
    private final double SINGLE_PRICE = 950.80;
    private final double DOUBLE_PRICE=1325.60;

    public HotelRoom(Type type, String personName) {
        this.type = type;
        
        if (type==Type.SINGLE){
        price = SINGLE_PRICE;
        }
        else{
        price= DOUBLE_PRICE;
        }
        this.personName = personName;
    
    }
    
    @Override
    public String toString() {
        return "HotelRoom{" + "type=" + type + ", price=" + price + ", personName=" + personName + '}';
    }

      
    
    
    
}
