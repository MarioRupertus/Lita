/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mil.cet002.compraslita;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author User
 */
public class LitaDB {
    
    SessionFactory sessionFactory = null;
    
    
    public LitaDB(){
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // obtiene los valores de hibernate.cfg.xml
                .build();
            sessionFactory = new MetadataSources(registry)
                    .buildMetadata().buildSessionFactory();
    }
    
    public List<Producto> buscarProductoPorNombre(String nombre){

        //pido una sesion de BD
        Session session = sessionFactory.openSession();
        CriteriaQuery<Producto> q
                = session.getCriteriaBuilder().createQuery(Producto.class);
        q.select(q.from(Producto.class));
        List<Producto> l = session.createQuery(q).list();
        //libero la sesion
        session.close();
        return l;

    }
    
    public Comercio getComercio(int id){
        Session session = sessionFactory.openSession();
        Comercio c=session.get(Comercio.class, id);
        session.close();
        return c;
    }
    
    public void actualizarComercio(Comercio c){
    Session session = sessionFactory.openSession();
    session.beginTransaction();
    session.update(c);
    session.getTransaction().commit();
    session.close();
    }
    

    
}
