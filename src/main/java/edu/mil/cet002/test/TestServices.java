/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mil.cet002.test;

import edu.mil.cet002.compraslita.Comercio;
import edu.mil.cet002.compraslita.LitaDB;
import edu.mil.cet002.compraslita.Producto;
import edu.mil.cet002.compraslita.Servicios;
import java.util.List;

/**
 *
 * @author User
 */
public class TestServices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LitaDB litaDB = new LitaDB();
//        List<Producto> l=litaDB.buscarProductoPorNombre("");
//        System.out.println("Lista de Productos");
//            for (Producto p : l) {
//                System.out.println(p);
//            }
            
     
     List<Producto> lista=litaDB.buscarProductoPorNombre("C",-1,"puntuacion","ASC");
     System.out.println("Lista de productos"+lista.size());
     for (Producto p:lista){
         int punt=p.getComercio().getCalificacionPositiva()-p.getComercio().getCalificacionNegativa();
         System.out.println("Producto: "+p.getNombre()+" Precio: $"+p.getPrecio()+" Comercio:"+p.getComercio().getNombre()+" horario apertura:"+p.getComercio().getHorarioApertura()+" Horario cierre:"+p.getComercio().getHorarioCierre()+" Puntuacion:"+punt);
     }
     
     litaDB.cerrarSesion();
         
     
//        Comercio c= litaDB.getComercio(1);
//        System.out.println("Negativas: "+c.getCalificacionNegativa());
//        c.setCalificacionNegativa(c.getCalificacionNegativa()+1);
//        litaDB.actualizarComercio(c);
//        System.out.println("Negativas: "+c.getCalificacionNegativa());
//            
            
//         List<Producto> lista=Servicios.getInstance().buscarProducto("");
//         for (Producto p : lista) {
//                System.out.println(p);
//            }
//         
         
    }
    
}
