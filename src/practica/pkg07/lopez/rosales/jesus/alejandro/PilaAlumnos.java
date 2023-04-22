/*
López Rosales Jesús Alejandro
22110104       3°O        POE
*/

package practica.pkg07.lopez.rosales.jesus.alejandro;

public class PilaAlumnos {

    public Alumno pila;

    public PilaAlumnos() {
        pila = null;
    }

    public void push(String nombre, String apellido, int matricula, String carrera) {
        Alumno nuevo = new Alumno(nombre, apellido, matricula, carrera);
        if (pila == null) {
            pila = nuevo;
        } else {
            Alumno aux = pila;
            pila = nuevo;
            nuevo.setAlumnoSiguiente(aux);
        }
    }

    public String recorrerPila() {
        Alumno aux = pila;
        String datos = "";
        if (pila == null) {
            System.out.println("La pila ALUMNOS está vacía.");
        } else {
            while (aux != null) {
                datos = datos + "DATOS DEL ALUMNO\n";
                datos = datos + "Nombre: " + aux.getNombre() + "\n";
                datos = datos + "Apellido: " + aux.getApellido() + "\n";
                datos = datos + "Matricula: " + aux.getMatricula() + "\n";
                datos = datos + "Carrera: " + aux.getCarrera() + "\n\n";
                aux = aux.getAlumnoSiguiente();
            }
        }
        return datos;
    }

    public void pop() {
        Alumno aux = pila;
        if (pila == null) {
            System.out.println("La pila está vacía.");
        } else {
            if (aux.getAlumnoSiguiente()== null) {
                pila = null;
            } else {
                pila = aux.getAlumnoSiguiente();
            }
        }
    }

}
