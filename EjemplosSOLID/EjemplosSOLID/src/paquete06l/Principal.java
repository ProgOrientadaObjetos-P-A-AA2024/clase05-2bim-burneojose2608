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
        Banco t1 = new Banco();
        t1.establecerNombre("banco de guayaquil");
        
        TarjetaCredit t1 = new TarjetaCredit();
        t1.establecerNombre("visa");
        t1.establecerNumero("112325456");
        t1.establecerBanco(t1);
        
        
        MayorEdad representante = new MayorEdad("José", t1);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s - Tarjeta:%s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta());
        
    }
}
