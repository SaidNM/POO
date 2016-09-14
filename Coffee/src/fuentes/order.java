package fuentes;
public class order {

    private int largeBox;
    private int mediumBox;
    private int smallBox;
    private int bolsas;
    private int restantes;
    private double costoBox;
    private static final double LARGE_BOX_COST=2.0;
    private static final double MEDIUM_BOX_COST=1.0;
    private static final double SMALL_BOX_COST=0.55;
    private static final double BAG_COST=5.5;
    private double costo_large;
    private double costo_medium;
    private double costo_small;
    private double costo_bolsas;
    private double total;
    public order(int bolsas) {
        this.bolsas=bolsas;
    }

public void cajas(){
    
    largeBox=bolsas/20;
    restantes=bolsas%20;
    
    if(restantes>15){
    largeBox++;
    }
    else if(restantes==15){
    mediumBox=smallBox=1;
    }
    else if(restantes<15 && restantes >10){
        mediumBox=smallBox=1;
    }
    else if(restantes<=10 && restantes>5){
        mediumBox++;
   
    }
    else if(restantes>0){
    smallBox++;
    }
    
    
}
public void costos(){
    costo_large=largeBox*LARGE_BOX_COST;
    costo_medium=mediumBox*MEDIUM_BOX_COST;
    costo_small=smallBox*SMALL_BOX_COST;
    costo_bolsas=bolsas*BAG_COST;
    costoBox=costo_large + costo_medium + costo_small;
    total=costo_bolsas+costoBox;
    
    
    
}
  @Override
    public String toString() {
        cajas();
        costos();
        return "Number of bags Ordered: "+bolsas+" - $"+costo_bolsas+"\nBox Used: \n\tLarge= " + largeBox + "- $"+ costo_large + "\n\tmediumBox= " + mediumBox +"- $"+costo_medium+ "\n\tsmallBox= " + smallBox+"- $"+costo_small+"\nYour total cost is: $"+total;
        
        
    }
  
}
