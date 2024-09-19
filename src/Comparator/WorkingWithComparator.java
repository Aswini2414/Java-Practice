package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class WorkingWithComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(104,"Aishu",24));
		persons.add(new Person(96,"Anu",23));
		persons.add(new Person(86,"Lalitha",22));
		persons.add(new Person(102,"Kaveri",24));
		
		Collections.sort(persons,new AgeComparator());
		
		System.out.println(persons);
		
		Collections.sort(persons,(Person o1,Person o2)-> {
				return o1.getName().compareTo(o2.getName());
		});
		
		System.out.println(persons);
	}

}


class Person {
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
	
	
}

class AgeComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}
	
}


