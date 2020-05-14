package com.hibernate.demoHibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StudentName studentOne=new StudentName();
    	studentOne.setFirst_name("Ashik");
    	studentOne.setMiddle_name("Shakil");
    	studentOne.setLast_name("Pranto");
    	
       Student student=new Student();
       student.setStu_id(1882);
       student.setStu_cgpa("3.80");
       student.setName(studentOne);
       
       Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
       ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
       SessionFactory sf=con.buildSessionFactory(sr);
       Session session=sf.openSession();
       Transaction tr=session.beginTransaction();
       session.save(student);
       tr.commit();
    }
}
