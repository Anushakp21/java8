package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapDemo {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(1,2,3,4);
		Function<Integer,Integer> mapper=new Function<Integer,Integer>() {
			@Override
			public Integer apply(Integer i) {
				return i*i;
			}
		};
		List<Integer> result=nums.stream().map(mapper).collect(Collectors.toList());
		System.out.println(result);
	}
}
