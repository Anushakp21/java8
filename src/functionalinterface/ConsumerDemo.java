package functionalinterface;
import java.util.function.Consumer;


class Person
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class ConsumerDemo {
	public static void main(String[] args) {
		Person p=new Person();
		Consumer<Person> setName=t -> t.setName("anu");
		setName.accept(p);
		System.out.println(p.getName());
	}

}
