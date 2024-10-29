package dateandtime;

import java.time.LocalDateTime;
import java.time.Month;

public class Demo2 {
	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.of(2002,Month.DECEMBER,13, 12, 45);
		System.out.println(dt);
		
		System.out.println("After six moths"+dt.plusMonths(6));
	}
}
