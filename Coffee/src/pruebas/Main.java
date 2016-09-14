package pruebas;

import fuentes.order;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {   
        Date fecha=new Date();
        SimpleDateFormat ft=new SimpleDateFormat("MM dd,YYYY");
        
        System.out.println(ft.format(fecha));
        
        
        
        
        
        order miorden=new order(32);
        System.out.println(miorden);
        
    }
    
}
