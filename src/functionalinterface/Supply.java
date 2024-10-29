package functionalinterface;

import java.sql.Date;
import java.util.function.Supplier;

public class Supply {
	
	public static void main(String[] args) {
		Supplier<Date> sp=()-> new Date(System.currentTimeMillis());
		System.out.println(sp.get());
	}

}
