package api07.Date;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * @author : 이종화
 * @date : 2020. 5. 14.
 * @description : 단순히 날짜를 뿌려줄때 좋다, Calendar - 날짜를 계산할 때 좋다.
 */
public class CalendarExam {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		
		//날짜 - 시간 바꿔야 한다.
		Date date = today.getTime();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
		System.out.println("\n\n");
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int day = today.get(Calendar.DAY_OF_MONTH);		
		System.out.println(year + " " + month + " " + day);
	
		int hour = today.get(Calendar.HOUR);
		int minute = today.get(Calendar.MINUTE);
		int seconds = today.get(Calendar.SECOND);	
		System.out.println(hour + " " + minute + " " + seconds);
	}

		
		
}
