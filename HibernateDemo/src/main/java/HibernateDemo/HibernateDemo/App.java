package HibernateDemo.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	Student student=new Student();
    	student.setId(1);
    	student.setName("Keval");
    	student.setAge(24);
    	
    	Configuration configuration=new Configuration();
    	
    	SessionFactory factory=configuration.buildSessionFactory();
    	Session session=factory.openSession();
    	session.save(student);	
    	
    	
    }
}
