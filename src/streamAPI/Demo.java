package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
public static void main(String[] args) {
	List<Integer> nums=Arrays.asList(4,5,2,3,7,8,9);
	int result=nums.stream()
	.filter(n -> n%2 ==0)
	.sorted()
	.map(n ->n * 2)
	.reduce(0,(c,e) -> c+e);
	System.out.println(result);
	//System.out.println(s.sorted());
	//System.out.println(s.count());
	//s.forEach(n -> System.out.println(n));
	//Stream<Integer> soretedData=s.sorted();
	//soretedData.forEach(n -> System.out.println(n));
	
//	for(int n : nums)
//	{
//		System.out.println(n * 2);
//	}
	
//	Stream<Integer> mappedData =data.map(n ->n * 2);
//	mappedData.forEach(n -> System.out.println(n));
//		
}
}
