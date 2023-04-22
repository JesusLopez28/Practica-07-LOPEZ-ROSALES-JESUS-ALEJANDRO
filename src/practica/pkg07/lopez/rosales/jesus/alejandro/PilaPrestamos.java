/*
López Rosales Jesús Alejandro
22110104       3°O        POE
*/

package practica.pkg07.lopez.rosales.jesus.alejandro;

import java.util.Date;

public class PilaPrestamos {

    public Prestamo pila;

    public PilaPrestamos() {
        pila = null;
    }

    public void push(Alumno alumno, Libro libro, Date fechaPrestamo, Date fechaDevolucion) {
        Prestamo nuevo = new Prestamo(alumno, libro, fechaPrestamo, fechaDevolucion);
        if (pila == null) {
            pila = nuevo;
        } else {
            Prestamo aux = pila;
            pila = nuevo;
            nuevo.setPrestamoSiguiente(aux);
        }
    }

    public String recorrerPila() {
        Prestamo aux = pila;
        String datos = "";
        if (pila == null) {
            System.out.println("La pila PRESTAMOS está vacía.");
        } else {
            while (aux != null) {
                datos = datos + "DATOS DEL PRESTAMO\n";
                datos = datos + "Alumno: " + aux.getAlumno()+ "\n";
                datos = datos + "Libro: " + aux.getLibro()+ "\n";
                datos = datos + "Fecha de prestamo: " + aux.getFechaPrestamo()+ "\n";
                datos = datos + "Fecha de devolución: " + aux.getFechaDevolucion()+ "\n\n";
                aux = aux.getPrestamoSiguiente();
            }
        }
        return datos;
    }

    public void pop() {
        Prestamo aux = pila;
        if (pila == null) {
            System.out.println("La pila está vacía.");
        } else {
            if (aux.getPrestamoSiguiente()== null) {
                pila = null;
            } else {
                pila = aux.getPrestamoSiguiente();
            }
        }
    }

}
