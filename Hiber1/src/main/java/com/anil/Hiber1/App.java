package com.anil.Hiber1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hibernate Application..." );
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        
        Developer obj=new Developer(103, "Shiva Mekala", "Quality Analyst");
        
        //session.save(obj);
        
        session.persist(obj);
        
        tx.commit();
        session.close();
        System.out.println("Insertion Success");
        
        
    }
}
