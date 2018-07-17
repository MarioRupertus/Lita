package edu.mil.cet002.compraslita;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class LitaDB {

    SessionFactory sessionFactory = null;
    StandardServiceRegistry registry = null;

    public void cerrarSesion() {
        try {
            sessionFactory.close();
            if (registry != null) {
                StandardServiceRegistryBuilder.destroy(registry);
            }
        } catch (Exception e) {
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
            hql = hql + " order by ((p.comercio.calificacionPositiva) - (p.comercio.calificacionNegativa)) " + orden;
        }
        Query q = session.createQuery(hql, Producto.class);
        q.setParameter("nombre", "%" + nombre + "%");
        if (horario != -1) {
            q.setParameter("horario", horario);
        }
        List<Producto> productos = q.list();
        session.close();
        return productos;
    }

    public Comercio getComercio(int id) {
        Session session = sessionFactory.openSession();
        Comercio comercio = session.get(Comercio.class, id);
        session.close();
        return comercio;
    }

    public void actualizarComercio(Comercio comercio) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(comercio);
        session.getTransaction().commit();
        session.close();
    }

    public Mapa getMapa() {
        Session session = sessionFactory.openSession();
        Mapa mapa = new Mapa();
        Query q = session.createQuery("from Nodo", Nodo.class);
        mapa.setMapa(q.list());
        session.close();
        return mapa;
    }

    public List<Proximos> getProximos() {
        Session session = sessionFactory.openSession();
        List<Proximos> proximo = new ArrayList<>();
        Query q = session.createQuery("from Proximos", Proximos.class);
        proximo = q.list();
        session.close();
        return proximo;
    }

    public List<Producto> getProductos() {
        Session session = sessionFactory.openSession();
        List<Producto> productos = new ArrayList<>();
        Query q = session.createQuery("from Producto", Producto.class);
        productos = q.list();
        session.close();
        return productos;
    }
}
