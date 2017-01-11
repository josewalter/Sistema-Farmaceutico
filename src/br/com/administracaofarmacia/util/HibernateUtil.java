package br.com.administracaofarmacia.util;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * 
 * @author 
 *
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;  
      
    static   
    {  
        try  
        {  
            sessionFactory = new Configuration().configure().buildSessionFactory();  
        } catch (Throwable e) {   
              e.printStackTrace();
        }  
    }  
  
    public static Session openSession()  throws HibernateException {
            return sessionFactory.openSession();
    }  
    
    public static Session getCurrentSession() throws HibernateException { 
           return sessionFactory.getCurrentSession(); 
    }  
}
 

  

