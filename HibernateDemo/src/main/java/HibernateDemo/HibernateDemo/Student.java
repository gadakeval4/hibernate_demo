package HibernateDemo.HibernateDemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int id;
//	private Name name;
	private int age;

	/*
	 * @OneToOne private Laptop laptop;
	 * 
	 */
	/*
	 * public Laptop getLaptop() { return laptop; }
	 * 
	 * public void setLaptop(Laptop laptop) { this.laptop = laptop; }
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*
	 * public Name getName() { return name; }
	 * 
	 * public void setName(Name name) { this.name = name; }
	 */

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + "]";
	}

	public Student() {
		super();
	}

}
