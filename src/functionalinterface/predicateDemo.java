package functionalinterface;

import java.util.function.Predicate;

public class predicateDemo {
public static void main(String[] args) {
	Predicate<String> checkLength=(str) ->str.length() > 5;
	System.out.println(checkLength.test("anu"));
}
}
