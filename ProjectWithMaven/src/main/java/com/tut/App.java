package com.tut;

import java.util.Date;

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
        System.out.println( "Project Started" );
       // SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        Configuration cfg = new Configuration();
        cfg.configure("com/tut/hibernate.cfg.xml"); 
        //" hibernate.cfg.xml " write only this now i remove xml file from com.tut package 
        SessionFactory factory = cfg.buildSessionFactory();
        
        //creating Student
        Student st = new Student();
        st.setId(101);
        st.setName("Anisha");
        st.setCity("Jodhpur");
        System.out.println(st);
        
        //creating object of Address class
        Address ad = new Address();
        ad.setStreet("street1");
        ad.setCity("Pune");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1234.234);
        
        Session session =  factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit();
        session.close();
        System.out.println("done");
        
        
        
       // System.out.println(factory);
       // System.out.println(factory.isClosed());
    }
}
