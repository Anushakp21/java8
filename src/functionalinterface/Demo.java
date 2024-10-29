package functionalinterface;

import java.util.function.Function;

public class Demo {
	public static void main(String[] args) {
		Function<String, Integer> f=s->s.length();
		System.out.println(f.apply("Anu"));
		
		Function<String, String> f1=s->s.toUpperCase();
		System.out.println(f1.apply("anusha"));
	}

}
