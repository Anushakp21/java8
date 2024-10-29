package streamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterDemo {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(1,2,3,4);
		Predicate<Integer> predi=new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer i) {
				// TODO Auto-generated method stub
				return i%2 ==0;
			}
		};
		
		nums.stream().filter(predi).forEach(System.out::println);
		//or
		nums.stream().filter(n -> n%2==0).forEach(n -> System.out.println(n));
	}

}
