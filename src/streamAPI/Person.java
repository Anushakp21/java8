package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Person {
	int age;
	String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
    public String toString() {
        return name + " (" + age + ")";
    }
	public static void main(String[] args) {
		List<Person> ls=Arrays.asList(
	            new Person(30, "Alice"),
	            new Person(25, "Bob"),
	            new Person(35, "Charlie")
	            );
		
		Optional<Person> minAge=ls.stream().min(Comparator.comparing(Person :: getAge));
		if(minAge.isPresent())
			System.out.println(minAge.get());
		
		ls.stream().max(Comparator.comparing(Person :: getName))
				.ifPresent(Person -> System.out.println("MAx Name is : " +Person.getName()));
	}

}
