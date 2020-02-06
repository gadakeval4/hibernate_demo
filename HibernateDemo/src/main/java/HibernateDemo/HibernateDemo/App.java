package HibernateDemo.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{

		Student student=new Student();
		/*
		 * student.setId(2); student.setName("Raj"); student.setAge(22);
		 */


		Name name=new Name();
		name.setFname("Keval");
		name.setLname("Gada");


		student.setId(111);
		student.setName(name);
		student.setAge(22);


		Configuration configuration=new Configuration().configure().addAnnotatedClass(Student.class);

		ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();

		SessionFactory factory=configuration.buildSessionFactory(registry);
		Session session=factory.openSession();
		Transaction transaction =session.beginTransaction();
		session.save(student);	

		//    	student=(Student) session.get(Student.class, 2);

		transaction.commit();

		System.out.println(student);


	}
}
