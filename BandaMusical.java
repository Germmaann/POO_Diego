package musica;

public class BandaMusical {
    private String nombre;
    private int integrantes;
    private int cantidadDiscos;
    
    public BandaMusical(String nombre, int integrantes, int cantidadDiscos){
        this.nombre = nombre;
        this.integrantes = integrantes;
        this.cantidadDiscos = cantidadDiscos;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the integrantes
     */
    public int getIntegrantes() {
        return integrantes;
    }

    /**
     * @param integrantes the integrantes to set
     */
    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }

    /**
     * @return the cantidadDiscos
     */
    public int getCantidadDiscos() {
        return cantidadDiscos;
    }

    /**
     * @param cantidadDiscos the cantidadDiscos to set
     */
    public void setCantidadDiscos(int cantidadDiscos) {
        this.cantidadDiscos = cantidadDiscos;
    }
}
