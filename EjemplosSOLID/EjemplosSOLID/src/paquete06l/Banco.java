/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06l;

/**
 *
 * @author USUARIO
 */
public class Banco {

    private String nombre;

    public Banco(String x) {
        nombre = x;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public String obtenerNombre() {
        return nombre;
    }
}
