package streamAPI;

import java.util.Arrays;
import java.util.List;

public class SortDemo 
{
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(1,2,3,4);
		nums.stream().sorted().forEach(x -> System.out.println(x));
	}
}
