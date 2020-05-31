package api07.Date;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * @author : 이종화
 * @date : 2020. 5. 14.
 * @description : simpledateformat // java.text.DateFormat
 */
public class DateExam {

	public static void main(String[] args) throws Exception {
		Date date = new Date();
		System.out.println(date.toString());		//2020-05-14 09:23:23
		
		System.out.println(date.getYear());
		System.out.println(date.getMonth() + 1);
		System.out.println(date.getDate());
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		System.out.println();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy년 MM월 dd일 E요일");
		System.out.println(sdf2.format(date));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss	a");
		System.out.println(sdf3.format(date));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("올해의 D번째 날");
		System.out.println(sdf4.format(date));
	
		//문자를 날짜로 바꾸기
		String str = "1980-12-25";
		Date strDate = sdf1.parse(str);
		System.out.println(strDate.toString());
	
	}
	
	
	
}
