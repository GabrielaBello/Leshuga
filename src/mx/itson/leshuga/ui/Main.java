/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.leshuga.ui;

import java.util.ArrayList;
import java.util.List;

import mx.itson.leshuga.entidades.MenuDia;
import mx.itson.leshuga.entidades.Sushi;
import mx.itson.leshuga.enumeradores.Tipo;

/**
 *Asignación de los valores y su impresion.
 * @author Gabriela Pérez Bello
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuDia menuDia = new MenuDia();
        menuDia.setDia("Martes");
        
        //Se agregaron sushis 
        List<Sushi> sushis = new ArrayList<>();
        
        Sushi sushi1 = new Sushi();
        sushi1.setNombre("Camarón Roll");
        sushi1.setPrecio(95);
        sushis.add(sushi1);
        
        Sushi sushi2 = new Sushi();
        sushi2.setNombre("Mar y Tierra");
        sushi2.setPrecio(95);
        sushis.add(sushi2);
        
        Sushi sushi3 = new Sushi();
        sushi3.setNombre("Futomaki Roll");
        sushi3.setPrecio(95);
        sushis.add(sushi3);
        
        Sushi sushi4 = new Sushi();
        sushi4.setNombre("Camarón Blue");
        sushi4.setPrecio(95);
        sushis.add(sushi4);
        
        menuDia.setSushi(sushis);
        
        menuDia.setTipo(Tipo.EMPANIZADO);
        
        System.out.println("***Menú " + menuDia.getDia() + "***");
        System.out.println("____________________________________");
        System.out.println("Sushis:           |      Precio");
        for(Sushi s : menuDia.getSushi()){
        System.out.println(s.getNombre() + "             $" + s.getPrecio());
        
        }
   
        
    }
    
}
