package HibernateDemo.HibernateDemo;

import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
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

//		Student student=new Student();
		/*
		 * student.setId(2); student.setName("Raj"); student.setAge(22);
		 */


		//Embeddable Name
		/*
		 * Name name=new Name(); name.setFname("Keval"); name.setLname("Gada");
		 * 
		 */
		//Set Laptop
		/*
		 * Laptop laptop=new Laptop(); laptop.setId(1101); laptop.setName("Dell");
		 */
		//Set Student 
		/*
		 * student.setId(111); student.setName(name); student.setAge(22);
		 */
//		student.setLaptop(laptop);
	

		Configuration configuration=new Configuration().configure().
				addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);

//		ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();

		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction =session.beginTransaction();
		
//		session.save(laptop);
//		session.save(student);	

		//    	student=(Student) session.get(Student.class, 2);

		/*
		 * Random random=new Random();
		 * 
		 * for (int i = 0; i < 20; i++) {
		 * 
		 * Student student=new Student(); student.setId(i);
		 * student.setAge(random.nextInt(200)); session.save(student);
		 * 
		 * }
		 */
		
//		Query query=session.createQuery("from Student where age > 100");

		//HQL		
		/*
		 * Query query=session.createQuery("from Student where age = 139"); Student
		 * student=(Student) query.uniqueResult();
		 */
//		List<Student> students= query.list();
		
		/*
		 * for (Student student : students) { System.out.println(student); }
		 */
//		System.out.println(student);
		
		
		
		//SQL Query
		SQLQuery query=session.createSQLQuery("select * from student");
		query.addEntity(Student.class);
		List<Student> students=query.list();
		
		for (Student student : students) {
			System.out.println(student);
		}
		
		transaction.commit();


	}
}
