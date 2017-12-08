package musica;

public class Rock extends BandaMusical implements InterfazBanda{
    
    private String guitarraElectrica;
    private String bateria;
    private String bajo;
    private String piano;
            
    public Rock(String mezcladora, String pianoElectrico, String cantidadSintetizadores, String tomarmesas, String nombre, int integrantes, int cantidadDiscos){
                 
        super(nombre, integrantes, cantidadDiscos);
        
        this.guitarraElectrica=guitarraElectrica;
        this.bateria=bateria;
        this.bajo=bajo;
        this.piano=piano;
    }

    /**
     * @return the guitarraElectrica
     */
    public String getGuitarraElectrica() {
        return guitarraElectrica;
    }

    /**
     * @param guitarraElectrica the guitarraElectrica to set
     */
    public void setGuitarraElectrica(String guitarraElectrica) {
        this.guitarraElectrica = guitarraElectrica;
    }

    /**
     * @return the bateria
     */
    public String getBateria() {
        return bateria;
    }

    /**
     * @param bateria the bateria to set
     */
    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    /**
     * @return the bajo
     */
    public String getBajo() {
        return bajo;
    }

    /**
     * @param bajo the bajo to set
     */
    public void setBajo(String bajo) {
        this.bajo = bajo;
    }

    /**
     * @return the piano
     */
    public String getPiano() {
        return piano;
    }

    /**
     * @param piano the piano to set
     */
    public void setPiano(String piano) {
        this.piano = piano;
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