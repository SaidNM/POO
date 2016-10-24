
package sources;


public class Luchador {
    public String estilo;
    public String categoria;
    public double dinero;
    
    
    public Luchador() {
        this.estilo = "Libre";
        this.categoria = "Rudo";
    }
    
    
    
    public double ganarDinero(){
    return dinero+5000;
    }
    
    public String actuacion(){
    return "Lucharan de dos a tres caidas sin limite de tiempo.. pim pim pim..";
    
    }
    
    
}
