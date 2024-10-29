package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapDemo2 {
	public static void main(String[] args) {
		List<String> ls=Arrays.asList("banana","apple","orange");

		Function<String,String> func = new Function<String,String>()
		{

			@Override
			public String apply(String t) {
				return t.toUpperCase();
			}

		};
		List<String> result=ls.stream().map(func).collect(Collectors.toList());
		System.out.println(result);
		
		ls.stream().map(String :: toUpperCase).forEach( x -> System.out.println(x));
	}

}
