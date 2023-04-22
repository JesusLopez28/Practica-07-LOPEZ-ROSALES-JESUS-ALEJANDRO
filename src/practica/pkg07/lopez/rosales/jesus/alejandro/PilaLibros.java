/*
López Rosales Jesús Alejandro
22110104       3°O        POE
*/

package practica.pkg07.lopez.rosales.jesus.alejandro;

public class PilaLibros {

    public Libro pila;

    public PilaLibros() {
        pila = null;
    }

    public void push() {
        Libro nuevo = new Libro();
        if (pila == null) {
            pila = nuevo;
        } else {
            Libro aux = pila;
            pila = nuevo;
            nuevo.setLibroSiguiente(aux);
        }
    }

    public String recorrerPila() {
        Libro aux = pila;
        String datos = "";
        if (pila == null) {
            System.out.println("La pila LIBROS está vacía.");
        } else {
            while (aux != null) {
                datos = datos + "DATOS DEL LIBRO\n";
                datos = datos + "Título: " + aux.getTitulo()+ "\n";
                datos = datos + "Auntor: " + aux.getAutor()+ "\n";
                datos = datos + "Año de publicación: " + aux.getAñoPublicacion()+ "\n";
                datos = datos + "Editorial: " + aux.getEditorial()+ "\n\n";
                aux = aux.getLibroSiguiente();
            }
        }
        return datos;
    }

    public void pop() {
        Libro aux = pila;
        if (pila == null) {
            System.out.println("La pila está vacía.");
        } else {
            if (aux.getLibroSiguiente()== null) {
                pila = null;
            } else {
                pila = aux.getLibroSiguiente();
            }
        }
    }

}
