package edu.mil.cet002.test;

import edu.mil.cet002.compraslita.Producto;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TestServicios {

    public static void main(String[] args) {
//        List<Producto> productos = Servicios.getInstance().buscarProducto("martillo");
//        for (Producto p : productos) {
//            System.out.println(p);
//        }

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // obtiene los valores de hibernate.cfg.xml
                .build();
        try {
            SessionFactory sessionFactory = new MetadataSources(registry)
                    .buildMetadata().buildSessionFactory();
            Session session = sessionFactory.openSession();

            session.beginTransaction();

            CriteriaQuery<Producto> q
                    = session.getCriteriaBuilder().createQuery(Producto.class);
            q.select(q.from(Producto.class));
            List<Producto> l = session.createQuery(q).list();
            System.out.println("Lista de Productos");
            for (Producto p : l) {
                System.out.println(p);
            }
            session.getTransaction().commit();

            session.close();
            sessionFactory.close();

        } catch (Exception e) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            e.printStackTrace();
        }
//session.beginTransaction();
//Query q = session.createQuery("from Productos", Producto.class);
//List<Producto> l = q.list();
//System.out.println("Lista de clientes no activos");
//for(Cliente cl: l){
//System.out.println(cl);
//}
//session.getTransaction().commit(); 

    }

}
