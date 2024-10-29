package functionalinterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class Student {
	String name;
	int marks;
	public Student(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}
	public static void main(String[] args) {
		Function<Student, String> f=s->{
			int marks=s.marks;
			String grade;
			if(marks >= 80) grade="[A]";
			else if(marks > 60) grade="[B]";
			else
				grade="Failed";
			return grade;
		};
		Predicate<Student> p=s->s.marks>=60;
	  Student s[]= {
			  new Student("Anu",100),
			  new Student("kp",80),
			  new Student("reshma",95),
			  new Student("kavya",20),
	  };
	  for(Student s1:s)
	  {
		  if(p.test(s1))
		  {
		  System.out.println("Student name :"+s1.name+" Student Grade: "+f.apply(s1));
		  System.out.println();
		  }
	  }
	}
}
