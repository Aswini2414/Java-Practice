package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//In comparable sorting can be done based on only one field such as age or name or id.
public class WorkingWithComparable {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(104,"Aishu",24));
		persons.add(new Person(96,"Anu",23));
		persons.add(new Person(86,"Lalitha",22));
		persons.add(new Person(102,"Kaveri",24));
		
		Collections.sort(persons); // sort method internally extends comparable, and the compareTo method is overridden in the Person class therefore sorting 
		// will be done according to that.
		System.out.println(persons);

	}

}

class Person implements Comparable<Person>{
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return o.id-this.id;
	}
	
	
	
	
}
