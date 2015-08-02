package curso.umg.myactivity;

/**
 * Created by Family on 01/08/2015.
 */
public class Actividad {
    private String actividad;
    private String descripcion;
    private String fechaLimite;

    public void Actividad(){

    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getActividad() {
        return actividad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }
}
