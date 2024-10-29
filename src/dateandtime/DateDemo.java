package dateandtime;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateDemo {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yy=date.getYear();
		
		System.out.println(dd+"-"+mm+"-"+yy);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		int hr=time.getHour();
		int min=time.getMinute();
		int sec=time.getSecond();
		int nanoSec=time.getNano();
		System.out.println(hr+":"+min+":"+sec+":"+nanoSec);		
	}
}
