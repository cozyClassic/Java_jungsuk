package day_010;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class ch10_2 {
	public static void main(String[] args){
		//DecimalFormatTest.test();
		//LocalDateTimeTest.dateTest();
		LocalDateTimeTest.timeTest();
	}
}

class DecimalFormatTest{
	static void test(){
		double number = 1234567.89;
		DecimalFormat df = new DecimalFormat("#.#E0");
		String result = df.format(number);
		System.out.println(result);
		// 1.2E6;

		DecimalFormat df2 = new DecimalFormat("#.#");
		System.out.println(df2.format(number));
		// 1234567.9; - 반올림됨.
	}
}

class LocalDateTimeTest{
	static void dateTest(){
		LocalDate myday = LocalDate.now();
		System.out.println(myday);
		//2021-12-01
		System.out.println(myday.getDayOfMonth());
		//1 (일)
		System.out.println(myday.getDayOfWeek());
		//WEDNESDAY (요일)
		System.out.println(myday.getDayOfWeek().getValue());
		// 3
		System.out.println(myday.getDayOfYear());
		// 335 (올해의 몇번째 날인지)
		System.out.println(myday.getYear());
		// 2021 (연도)
		System.out.println(myday.getMonth());
		// DECEMBER (월)
		System.out.println(myday.getMonthValue());
		// 12
	}

	static void timeTest(){
		LocalTime mytime = LocalTime.now();
		System.out.println(mytime);
		// 09:22:56.508785
		System.out.println(mytime.getHour());
		//9 - 시간
		System.out.println(mytime.getMinute());
		//24 - 분
		System.out.println(mytime.getSecond());
		// 39 - 초
		System.out.println(mytime.minusHours(1));
		// 08:24:39.192700 - 현재 시간에서 1시간 뺀 시간 반환.

		System.out.println(mytime.minusMinutes(125));
		// 07:19:39.192700 - 현재 시간에서 125분 뺀 시간 반환.

		System.out.println(mytime.minusHours(10));
		// 23:25:39.192700 - 24시간 넘어가면 자동 변환.

		System.out.println(mytime.withHour(1));
		// 01:24:39.192700 시간을 1로 변환.

	}
}