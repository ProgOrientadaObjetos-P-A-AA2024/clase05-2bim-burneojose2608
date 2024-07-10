/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class MayorEdad extends Persona{
    private TarjetaCredit tarjeta;
    
    public MayorEdad(String n, TarjetaCredit tar){
        super(n);
        tarjeta = tar;
    }
    
    public void establecerTarjeta(TarjetaCredit n){
        tarjeta = n;
    }
    
    public TarjetaCredit obtenerTarjeta(){
        return tarjeta;
    }

    
}
