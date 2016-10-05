package sources;



public class Banco {
    private int numClientes=0;
    private Cliente clientes[];
    
    public Banco() {
    this.clientes=new Cliente[10];
    }
    
    public void agregarCliente(String nom, String numCta, Cuenta cuenta){
        if (numClientes<10){
        this.clientes[this.numClientes]=new Cliente(nom);
        clientes[numClientes].setCuenta(cuenta);
        this.clientes[this.numClientes].setNumCuenta(numCta);
        
        this.numClientes++;
        }
        else{
            System.out.println("Banco lleno intenta en otro :v");
        }
    }

    public int getNumClientes() {
        return numClientes;
    }

    public Cliente[] getClientes() {
        return clientes;
    }
    public void imprimir(){
        System.out.println("Clientes: ");
        for (int i = 0; i < this.numClientes; i++) {
            System.out.println(""+this.clientes[i]);
        }
    
    }
    
    
}
