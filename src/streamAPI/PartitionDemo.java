package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PartitionDemo {

	int age;
	String name;
	public PartitionDemo(int age, String name) {
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
		// TODO Auto-generated method stub
		return "age:"+age+"  name :"+name;
	}
	public static void main(String[] args) {
		List<PartitionDemo> ls=Arrays.asList(
				new PartitionDemo(30, "Alice"),
				new PartitionDemo(30, "Alice"),
				new PartitionDemo(35, "Charlie")
				);

		Map<Boolean, List<PartitionDemo>> result=ls.stream().collect(Collectors.partitioningBy(PartitionDemo -> PartitionDemo.getAge()>25));
		System.out.println(result);

		Map<Object, List<PartitionDemo>> result1=ls.stream().collect(Collectors.groupingBy(PartitionDemo -> PartitionDemo.getName()));
		System.out.println(result1);
	}
}
