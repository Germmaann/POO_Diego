package musica;

public class Country extends BandaMusical implements InterfazBanda{
    
    private String banjo;
    private String armonica;
    private String contrabajo;
    private String triangulo;
            
    public Country(String banjo, String armonica, String contrabajo, String triangulo, String nombre, int integrantes, int cantidadDiscos){
                 
        super(nombre, integrantes, cantidadDiscos);
        
        this.banjo=banjo;
        this.armonica=armonica;
        this.contrabajo=contrabajo;
        this.triangulo=triangulo;
        
    }

    /**
     * @return the banjo
     */
    public String getBanjo() {
        return banjo;
    }

    /**
     * @param banjo the banjo to set
     */
    public void setBanjo(String banjo) {
        this.banjo = banjo;
    }

    /**
     * @return the armonica
     */
    public String getArmonica() {
        return armonica;
    }

    /**
     * @param armonica the armonica to set
     */
    public void setArmonica(String armonica) {
        this.armonica = armonica;
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
     * @return the triangulo
     */
    public String getTriangulo() {
        return triangulo;
    }

    /**
     * @param triangulo the triangulo to set
     */
    public void setTriangulo(String triangulo) {
        this.triangulo = triangulo;
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
    
    public void darConcierto(){
        System.out.println("Estan dando un concierto...");
    }
}