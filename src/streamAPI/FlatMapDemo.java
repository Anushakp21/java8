package streamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
	public static void main(String[] args) {
		List<List<String>> lss= Arrays.asList(Arrays.asList("one","two"),Arrays.asList("three","four"));
		
		List<String> result= lss.stream()
				.flatMap(Collection:: stream)
				.collect(Collectors.toList());
		System.out.println(result);
	}

}
