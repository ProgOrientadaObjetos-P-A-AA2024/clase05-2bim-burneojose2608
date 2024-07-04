/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02s;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private int edadminima;
    private int edadmaxima;
    private String listaCiudadesEstudiantes;
    // Una Persona, tiene un atributo ciudad de tipo Ciudad
    // Una Ciudad, tiene un atributo nombre de tipo String

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerEdadminima() {
        edadminima = 100;
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).obtenerEdad() < edadminima) {
                edadminima = estudiantes.get(i).obtenerEdad();
            }
        }
    }

    public void establecerEdadmaxima() {
        edadmaxima = 0;
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).obtenerEdad() > edadmaxima) {
                edadmaxima = estudiantes.get(i).obtenerEdad();
            }

        }
    }
   public void establecerListaCiudadesEstudiantes(){
       String cadena= "";
       for (int i = 0; i < estudiantes.size(); i++) {
           cadena= String.format("%s%s", cadena,
                   estudiantes.get(i).obtenerCiudad().obtenerNombre());
       }
       listaCiudadesEstudiantes = cadena;
   }
    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public double obtenerPromedioEdades() {

        return promedioEdades;
    }

    public int obtenerEdadminima() {
        return edadminima;
    }

    public int obteneEdadmaxima() {
        return edadmaxima;
    }
 public String obtenerListaCiudadesEstudiantes(){
     return listaCiudadesEstudiantes;
 }
 public String toString(){
     String cadena = String.format("Promedio edades : %2f\n"
             + "Edad minima %d\n"
             + "Edad maximo %d\n"
             + "Lista Ciudades %s\n",obtenerPromedioEdades(),
             obtenerEdadminima(),obteneEdadmaxima(),
             obtenerListaCiudadesEstudiantes());
     return cadena;
 }
}
