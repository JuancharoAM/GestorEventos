package Datos;

/**
 *
 * @author Juan
 */
public class TicketComprado {

    private String nombre;
    private String fecha;
    private String hora;
    private String bloque;
    private String numero;

    public TicketComprado() {
    }

    public TicketComprado(String nombre, String fecha, String hora, String bloque, String numero) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.bloque = bloque;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getBloque() {
        return bloque;
    }

    public void setBloque(String bloque) {
        this.bloque = bloque;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
