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


		//Embeddable Name
		Name name=new Name();
		name.setFname("Keval");
		name.setLname("Gada");


		//Set Laptop
		Laptop laptop=new Laptop();
		laptop.setId(1101);
		laptop.setName("Dell");
		
		//Set Student 
		student.setId(111);
		student.setName(name);
		student.setAge(22);

	

		Configuration configuration=new Configuration().configure().
				addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);

//		ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();

		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction =session.beginTransaction();
		
		session.save(laptop);
		session.save(student);	

		//    	student=(Student) session.get(Student.class, 2);

		transaction.commit();

		System.out.println(laptop);
		System.out.println(student);
		


	}
}
