
package prueba;
import fuentes.Television;

public class Prueba {
   public static void main(String[] args) {
       Television miTV;//Referencia a Objeto Television
       miTV=new Television(); //miTV ya es un objeto television
       //los objetos se crean en una zona de memoria llamada heap
       System.out.println("miTV "+ miTV.toString());
       miTV.subirCanal();
       System.out.println("miTV = "+miTV);
       miTV.subirVolumen();
       System.out.println("miTV = "+miTV);
       miTV.bajarCanal();
       System.out.println("miTV = "+miTV);
       miTV.bajarVolumen();
       System.out.println("miTV = "+miTV);
       miTV.irCanal(13);
       System.out.println("miTV = "+miTV);
       
 
   }
   
}
