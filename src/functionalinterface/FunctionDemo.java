package functionalinterface;

import java.util.function.Function;

public class FunctionDemo {
public static void main(String[] args) {
	Function<Integer, String> getInt=t ->t*10+" Data multiplied by 10";
	System.out.println(getInt.apply(2));
}
}
