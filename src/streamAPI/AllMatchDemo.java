package streamAPI;

import java.util.Arrays;
import java.util.List;

public class AllMatchDemo {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(-1,2,3,4);
		boolean result = nums.stream().allMatch(n -> n>0);//anyMatch or nonematch can be used like this only
		System.out.println(result);
	}

}
