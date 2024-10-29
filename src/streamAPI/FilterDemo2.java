package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls= Arrays.asList(1,4,7,8,9,11,12);
		List<Integer> ls2=ls.stream().filter(n -> n < 5).collect(Collectors.toList());
		System.out.println(ls2);
	}

}
