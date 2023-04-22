/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package practica.pkg07.lopez.rosales.jesus.alejandro;

import java.util.Date;

public class Prestamo {

    private Alumno alumno;
    private Libro libro;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private Prestamo prestamoSiguiente;

    public Prestamo(Alumno alumno, Libro libro, Date fechaPrestamo, Date fechaDevolucion) {
        this.alumno = alumno;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Prestamo() {
        this.alumno = null;
        this.libro = null;
        this.fechaPrestamo = null;
        this.fechaDevolucion = null;
        this.prestamoSiguiente = null;
    }

    public Prestamo getPrestamoSiguiente() {
        return prestamoSiguiente;
    }

    public void setPrestamoSiguiente(Prestamo prestamoSiguiente) {
        this.prestamoSiguiente = prestamoSiguiente;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

}
