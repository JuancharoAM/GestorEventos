package Datos;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author JafetDG
 */
public class Evento {

    private String tipoEvento;
    private String nombre;
    private Date fecha;
    private String hora;
    private int totalEntradas;
    private int entradasDisponibles;
    private Queue<String> colaBloques = new LinkedList();

    public Evento(String tipoEvento, String nombre, Date fecha, String hora, int totalEntradas, int entradasDisponibles, Queue colaBloques) {
        this.tipoEvento = tipoEvento;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.totalEntradas = totalEntradas;
        this.entradasDisponibles = entradasDisponibles;
        this.colaBloques = colaBloques;
    }

    public Evento() {
        this.tipoEvento = "";
        this.nombre = "";
        this.hora = "";
        this.totalEntradas = 0;
        this.entradasDisponibles = 0;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getTotalEntradas() {
        return totalEntradas;
    }

    public void setTotalEntradas(int totalEntradas) {
        this.totalEntradas = totalEntradas;
    }

    public int getEntradasDisponibles() {
        return entradasDisponibles;
    }

    public void setEntradasDisponibles(int entradasDisponibles) {
        this.entradasDisponibles = entradasDisponibles;
    }

    public Queue<String> getColaBloques() {
        return colaBloques;
    }

    public void setColaBloques(Queue<String> colaBloques) {
        this.colaBloques = colaBloques;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

}
