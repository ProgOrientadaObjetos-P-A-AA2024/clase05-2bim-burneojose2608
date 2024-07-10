/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        TarjetaCredit t1 = new TarjetaCredit();
        t1.establecerNombre("visa");
        t1.establecerNumero("112325456");
        
        MayorEdad representante = new MayorEdad("José", "Visa");
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s - Tarjeta:%s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta());
        
    }
}
