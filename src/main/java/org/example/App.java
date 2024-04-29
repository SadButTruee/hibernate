package org.example;

import org.example.model.Catalog;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(Catalog.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            //CREATE
//            session = sessionFactory.getCurrentSession();
//            Catalog catalog = new Catalog("Fantasy #15");
//            session.beginTransaction();
//            session.save(catalog);
//            session.getTransaction().commit();

            //READ
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            Catalog catalog = session.get(Catalog.class, 2L);
//            session.getTransaction().commit();
//            System.out.println(catalog);

//            //UPDATE
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            Catalog catalog = session.get(Catalog.class, 1L);
//            System.out.println(catalog);
//            catalog.setTitle("Fantasy #10");
//            session.getTransaction().commit();
//            System.out.println(catalog);

//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            session.createQuery("update Book from set title = 'A'").executeUpdate();
//            session.createQuery("delete from Book where id = 1").executeUpdate();
//            session.getTransaction().commit();

//            //DELETE
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            Catalog catalog = session.get(Catalog.class, 2L);
//            session.delete(catalog);
//            session.getTransaction().commit();

//            //ВЫБОРКА
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            //List catalogs= session.createQuery("from Catalog").getResultList();
//            List catalogs= session.createQuery("from Catalog c where c.title = :title")
//                    .setParameter("title", "Fantasy #15")
//                    .getResultList();
//            session.getTransaction().commit();
//            System.out.println(catalogs);



        } catch (HibernateException e) {
            throw new RuntimeException(e);
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
