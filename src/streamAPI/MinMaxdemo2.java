package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxdemo2 {
	public static void main(String[] args) {
		List<String> list= Arrays.asList("Anu","chandu","chitra","Martin");
		Optional<String> minStr=list.stream().min(Comparator.comparing(String :: valueOf));
		if(minStr.isPresent())
		System.out.println(minStr.get());
	}

}
