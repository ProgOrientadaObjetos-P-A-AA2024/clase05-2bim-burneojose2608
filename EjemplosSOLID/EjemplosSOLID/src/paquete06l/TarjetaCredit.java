/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06l;

/**
 *
 * @author USUARIO
 */
public class TarjetaCredit {
 private String nombre;
 private String numero;
 private Banco banco;

    public TarjetaCredit(String n, String m) {
        nombre = n;
        numero = m;
    }
 
 
 public void establecerNombre(String x){
     nombre=x;
 }
 public void establecerNumero(String x){
     numero=x;
 }
 public void establecerBanco(Banco x){
     banco=x;
 }
 public String obtenerNombre(){
     return nombre;
 }
 public String obtenerNumero(){
     return numero;
 }
 public Banco obtenerBanco(){
     return banco;
 }
}
