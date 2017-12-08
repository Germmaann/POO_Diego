package musica;

public class Clasica extends BandaMusical implements InterfazBanda{
    
    private String violin;
    private String contrabajo;
    private String arpa;
    private int cantidadPlatillos;
            
    public Clasica(String violin, String contrabajo, String arpa, int cantidadPlatillos, String nombre, int integrantes, int cantidadDiscos){
                 
        super(nombre, integrantes, cantidadDiscos);
        
        this.violin = violin;
        this.contrabajo = contrabajo;
        this.arpa = arpa;
        this.cantidadPlatillos = cantidadPlatillos;
    }
    /**
     * @return the violin
     */
    public String getViolin() {
        return violin;
    }

    /**
     * @param violin the violin to set
     */
    public void setViolin(String violin) {
        this.violin = violin;
    }

    /**
     * @return the contrabajo
     */
    public String getContrabajo() {
        return contrabajo;
    }

    /**
     * @param contrabajo the contrabajo to set
     */
    public void setContrabajo(String contrabajo) {
        this.contrabajo = contrabajo;
    }

    /**
     * @return the arpa
     */
    public String getArpa() {
        return arpa;
    }

    /**
     * @param arpa the arpa to set
     */
    public void setArpa(String arpa) {
        this.arpa = arpa;
    }

    /**
     * @return the cantidadPlatillos
     */
    public int getCantidadPlatillos() {
        return cantidadPlatillos;
    }

    /**
     * @param cantidadPlatillos the cantidadPlatillos to set
     */
    public void setCantidadPlatillos(int cantidadPlatillos) {
        this.cantidadPlatillos = cantidadPlatillos;
    }
    
    public void grabarAlbum(){
        System.out.println("Esta grabando su nuevo set...");
    }
 
    public void presentacionAntePublico(){
        System.out.println("Se estan presentando ante el publico...");
    }
    
    public void tocarCancion(){
        System.out.println("Estan tocando la del sonidito (la-la-la-la)...");
    }
    
    public void darPresentacion(){
        System.out.println("Estan dando un presentanción en el auditorio Josefa...");
    }
}
