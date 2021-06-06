package yuris.calendar;
import java.util.*;

public class Calendar {
	
	//변수선언
	public static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	//최대 일수 반환 함수
	
	public static int return_Maxday(int num) {
		return days[num-1];
	}

	public static void sample() {
		System.out.println("Hello, Calendar");

		System.out.println("일  월  화  수  목  금  토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

	
	}
	public static void main(String[] args) {

		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("월(month)를 입력하세요 : ");
		int month = sc.nextInt();
		Calendar cal = new Calendar();
		System.out.println(month + "월은 " + cal.return_Maxday(month) + "일 입니다.");
		
		cal.sample();
	}

}
