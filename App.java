package com.sena.app1;
import bus.sena.lab.Bus;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        
        Bus bus1 = new Bus("B-123", 10, 3000, 0, 0);
        
        System.err.println("SUBI 2");
        bus1.subirPasajeros(2);
        System.err.println("BAJE 1");
        bus1.bajarPasajeros(1);
        
        System.err.println("SUBI 10");
        bus1.subirPasajeros(10);
        
        System.err.println("BAJE 5");
        bus1.bajarPasajeros(5);
        
        System.err.println("SUBI 3");
        bus1.subirPasajeros(3);
        System.out.println(" hemos transportado : " +  bus1.getTotalPasajeros() + "," + " en total hemos recogido "  + "," +  bus1.getDineroAcumulado() + " en el bus van: " + bus1.getPasajerosActuales());
        
       
    }
}
