/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mil.cet002.test;

import edu.mil.cet002.compraslita.Comercio;
import edu.mil.cet002.compraslita.LitaDB;
import edu.mil.cet002.compraslita.Mapa;
import edu.mil.cet002.compraslita.Nodo;
import edu.mil.cet002.compraslita.Producto;
import edu.mil.cet002.compraslita.Proximos;
import edu.mil.cet002.compraslita.Servicios;
import java.util.List;
import org.hibernate.collection.spi.PersistentCollection;
import org.hibernate.proxy.HibernateProxy;
import org.hibernate.proxy.LazyInitializer;
import org.hibernate.proxy.pojo.bytebuddy.SerializableProxy;

/**
 *
 * @author User
 */
public class TestGetMapa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LitaDB litaDB = new LitaDB();

        List<Proximos> p = litaDB.getProximos();
        for (Proximos i : p) {

            Nodo origen = i.getNodoOrigen();
            Nodo origen2 = null;
            if (origen instanceof HibernateProxy) {
                HibernateProxy proxy = (HibernateProxy) origen;
                LazyInitializer li = proxy.getHibernateLazyInitializer();
                origen2 = (Nodo) li.getIdentifier();
            }

            origen2.toString();

            //origen = unproxyHibernateProxy(origen);
            // property.getWriteMethod().invoke(value, fieldValue);
            /*
            if (origen instanceof HibernateProxy) {
                origen = (Nodo) ((HibernateProxy) origen).getHibernateLazyInitializer()
                .getImplementation();
            }*/
        }

//     
//        Mapa m = litaDB.getMapa();
//        
//        for (Nodo n : m.getMapa()){
//            System.out.println("");
//            n.toString();
//            System.out.println("Vecino de " + n.getNombre());
//            for (Proximos p : n.getVecinos()){
//                p.toString();
//            }
//            System.out.println("");
//        }
//        
        litaDB.cerrarSesion();

    }

}
