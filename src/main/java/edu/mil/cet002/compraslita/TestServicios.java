/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mil.cet002.compraslita;

import java.util.List;
import javax.management.Query;
import javax.persistence.criteria.CriteriaQuery;

public class TestServicios {

    public static void main(String[] args) {
//        List<Producto> productos = Servicios.getInstance().buscarProducto("martillo");
//        for (Producto p : productos) {
//            System.out.println(p);
//        }
        session.beginTransaction();
        CriteriaQuery<Producto> p
                = session.getCriteriaBuilder().createQuery(Producto.class);
        q.select(q.from(Producto.class));
        List<Producto> l = session.createQuery(q).list();
        System.out.println("Lista de clientes");
        for (Producto p : l) {
            System.out.println(p);
        }
        session.getTransaction().commit();
        session.beginTransaction();
        Query q = session.createQuery("from Producto", Producto.class);
        List<Producto> l = q.list();
        System.out.println("Lista de clientes no activos");
        for (Producto p : l) {
            System.out.println(p);
        }
        session.getTransaction().commit();

    }

}
