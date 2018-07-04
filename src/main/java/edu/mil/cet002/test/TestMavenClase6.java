package edu.mil.cet002.test;

import edu.mil.cet002.compraslita.Nodo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author User
 */
public class TestMavenClase6 {

    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // obtiene los valores de hibernate.cfg.xml
                .build();
        try {
            
            
            int a = 40;
            SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            Nodo n = (Nodo) session.load(Nodo.class, 1);
                System.out.println("");
                System.out.println(n);
                System.out.println("");
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (Exception e) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            e.printStackTrace();
        }
    }

}
