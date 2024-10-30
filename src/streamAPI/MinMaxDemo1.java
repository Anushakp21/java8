package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxDemo1 {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(-1,2,3,4);
		Optional<Integer> minValue=	nums.stream().min(Comparator.comparing(Integer :: valueOf));
		System.out.println(minValue.get());
	}
}
