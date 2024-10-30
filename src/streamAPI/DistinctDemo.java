package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctDemo {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(1,1,2,3,2,3,4);
		List<Integer> result=nums.stream()
				.distinct().collect(Collectors.toList());
		System.out.println(result);	
	}
}
