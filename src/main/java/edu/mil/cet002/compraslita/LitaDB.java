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
import org.hibernate.query.Query;

/**
 *
 * @author User
 */
public class LitaDB {

    SessionFactory sessionFactory = null;
    StandardServiceRegistry registry = null;

    public void cerrarSesion() {
        try{
        sessionFactory.close();        
        if (registry!=null)
            StandardServiceRegistryBuilder.destroy(registry);
        }catch(Exception e){
        }
    }

    public LitaDB() {
        registry = new StandardServiceRegistryBuilder()
                .configure() // obtiene los valores de hibernate.cfg.xml
                .build();
        sessionFactory = new MetadataSources(registry)
                .buildMetadata().buildSessionFactory();
    }

    public List<Producto> buscarProductoPorNombre(String nombre, int horario, String criterioOrden, String orden) {
        Session session = sessionFactory.openSession();
        String hql = "from Producto p where p.nombre like :nombre";
        if (horario != -1) {
            hql = hql + " and p.comercio.horarioApertura<= :horario and p.comercio.horarioCierre > :horario ";
        }
        if ("precio".equals(criterioOrden)) {
            hql = hql + " order by p.precio " + orden;
        }
        if ("puntuacion".equals(criterioOrden)) {
            hql = hql + " order by p.comercio.calificacionPositiva - p.comercio.calificacionNegativa " + orden;
        }
        Query q = session.createQuery(hql, Producto.class);
        q.setParameter("nombre", "%" + nombre + "%");
        if (horario != -1) {
            q.setParameter("horario", horario);
        }
        List<Producto> l = q.list();
        session.close();
        return l;
    }

    public Comercio getComercio(int id) {
        Session session = sessionFactory.openSession();
        Comercio c = session.get(Comercio.class, id);
        session.close();
        return c;
    }

    public void actualizarComercio(Comercio c) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(c);
        session.getTransaction().commit();
        session.close();
    }

    public Mapa getMapa() {
        Session session = sessionFactory.openSession();
        Mapa m = new Mapa();
        Query q = session.createQuery("from Nodo", Nodo.class);
        m.setMapa(q.list());
        session.close();
        return m;
    }

    public List<Proximos> getProximos() {
        Session session = sessionFactory.openSession();
        List<Proximos> p = new ArrayList<>();
        Query q = session.createQuery("from Proximos", Proximos.class);
        p = q.list();
        session.close();
        return p;
    }

    public List<Producto> getProductos() {
        Session session = sessionFactory.openSession();
        List<Producto> p = new ArrayList<>();
        Query q = session.createQuery("from Producto", Producto.class);
        p = q.list();
        session.close();
        return p;
    }
}
