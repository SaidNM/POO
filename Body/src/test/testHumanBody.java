package test;
import sources.*;

public class testHumanBody
{
    public static void main(String[] args)
    {
        helmet casco = new helmet("XL");
        
        humanBody humano = new humanBody(new heart(78),casco);
        humanBody humano2 = new humanBody(new heart(20),casco);
        
        humano.getCorazon().setHeartRate(86);
        humano.getCasco().setSize("M");
        casco.setSize("L");
    }
    
    
}
