    
package sources;


public class El_Santo extends Luchador implements Volador{
    public boolean mascaraPlata;
    public boolean capaAntibalas;
    public int vampiros;
    public int momias;

    public El_Santo(boolean mascaraPlata, boolean capaAntibalas) {
        this.mascaraPlata = mascaraPlata;
        this.capaAntibalas = capaAntibalas;
    }
    
    public int matarVampiros(){
    return ++vampiros;
       
    }
    
    public int matarMomiasGto(){
    return ++momias;
    }
    
    

    @Override
    public String despegar() {
       return "Se prepara para volar";
    }

    @Override
    public String volar() {
        return "Vaya lanze!";
    }

    @Override
    public String aterrizar() {
        return "Miren que aterrizaje señores... 1..2..3... los rudos los rudos los rudos";
    }
    
}
