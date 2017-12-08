package musica;

public class Electronica extends BandaMusical implements InterfazBanda{
    
    private String mezcladora;
    private String pianoElectrico;
    private int cantidadSintetizadores;
    private String tornamesas;
            
    public Electronica(String mezcladora, String pianoElectrico, int cantidadSintetizadores, String tornamesas, String nombre, int integrantes, int cantidadDiscos){
                 
        super(nombre, integrantes, cantidadDiscos);
        
        this.mezcladora=mezcladora;
        this.pianoElectrico=pianoElectrico;
        this.cantidadSintetizadores=cantidadSintetizadores;
        this.tornamesas=tornamesas;
    }

    /**
     * @return the mezcladora
     */
    public String getMezcladora() {
        return mezcladora;
    }

    /**
     * @param mezcladora the mezcladora to set
     */
    public void setMezcladora(String mezcladora) {
        this.mezcladora = mezcladora;
    }

    /**
     * @return the pianoElectrico
     */
    public String getPianoElectrico() {
        return pianoElectrico;
    }

    /**
     * @param pianoElectrico the pianoElectrico to set
     */
    public void setPianoElectrico(String pianoElectrico) {
        this.pianoElectrico = pianoElectrico;
    }

    /**
     * @return the tomarmesas
     */
    public String getTornamesas() {
        return tornamesas;
    }

    /**
     * @param tomarmesas the tomarmesas to set
     */
    public void seTtornamesas(String tornamesas) {
        this.tornamesas = tornamesas;
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
    
    public void darFestival(){
        System.out.println("Estan en el festival...");
    }

    /**
     * @return the cantidadSintetizadores
     */
    public int getCantidadSintetizadores() {
        return cantidadSintetizadores;
    }

    /**
     * @param cantidadSintetizadores the cantidadSintetizadores to set
     */
    public void setCantidadSintetizadores(int cantidadSintetizadores) {
        this.cantidadSintetizadores = cantidadSintetizadores;
    }
}

