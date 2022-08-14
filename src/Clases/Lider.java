package Clases;

public class Lider {
    private int id_lider;
    private String nombre;
    private String primerApellido;
    private String ciudadResidencia;

    public Lider() {
    }

    public Lider(int id_lider, String nombre, String primerApellido, String ciudadResidencia) {
        this.id_lider = id_lider;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.ciudadResidencia = ciudadResidencia;
    }

    /**
     * @return the id_lider
     */
    public int getId_lider() {
        return id_lider;
    }

    /**
     * @param id_lider the id_lider to set
     */
    public void setId_lider(int id_lider) {
        this.id_lider = id_lider;
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
     * @return the primerApellido
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * @param primerApellido the primerApellido to set
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * @return the ciudadResidencia
     */
    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    /**
     * @param ciudadResidencia the ciudadResidencia to set
     */
    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    @Override
    public String toString() {
        return "Lider{" + "id_lider=" + id_lider + ", nombre=" + nombre + ", primerApellido=" + primerApellido + ", ciudadResidencia=" + ciudadResidencia + '}';
    }
    
    
}