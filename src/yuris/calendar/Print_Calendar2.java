package yuris.calendar;

import java.util.Scanner;

public class Print_Calendar2 {

	public final static String prompt = "Cal> ";
	// 변수선언
	public static int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	// 윤년 변수선언
	public static int[] leap_days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static boolean isLeap_year(int num) {
		if (num % 400 == 0) {
			return true;
		} else if (num % 4 == 0 && num % 100 == 0) {
			return false;
		} else if (num % 4 == 0) {
			return true;
		} else
			return false;
	}

	// 최대 일수 반환 함수
	public static int return_Maxday(int year, int num) {
		if (isLeap_year(year) == true) { // 윤년이면 윤년 일수가져옴
			return leap_days[num - 1];
		} else
			return days[num - 1];
	}

	// 요일을 가져오면 일로 변환하는 함수
	public int parseDay(String str) {
		if (str.equals("SU")) {
			System.out.println(0);
			return 0;
		} else if (str.equals("MO")) {
			return 1;
		} else if (str.equals("TU")) {
			return 2;
		} else if (str.equals("WE")) {
			return 3;
		} else if (str.equals("TH")) {
			return 4;
		} else if (str.equals("FR")) {
			return 5;
		} else if (str.equals("SA")) {
			return 6;
		} else {
			return 0;
		}
	}

	public static void runPrompt() {
		Scanner sc = new Scanner(System.in);
		int weekday = 0, i = 1, count = 0, delim = 0; // count는 첫줄출력최대숫자, delim은 줄넘김 기준
		String str_weekday = "";
		Print_Calendar2 pc = new Print_Calendar2();
		// 종료조건 -1 을 이용해 반복하기
		while (true) {
			System.out.println("년도를 입력하세요.");
			System.out.print(prompt);

			int year = sc.nextInt();
			if (year == -1) {
				System.out.println("Have a nice day!");
				sc.close();
				break;
			}

			System.out.println("월을 입력하세요.");
			System.out.print(prompt);
			int month = sc.nextInt();

			System.out.println("첫째날의 요일을 입력하세요 (SU, MO, TU, WE, TH, FR, SA)");
			str_weekday = sc.next();
			weekday = pc.parseDay(str_weekday);
			count = 7 - weekday;
			delim = count;
			if (delim == 7) {
				delim = 0;
			}

			if (month == -1) {
				System.out.println("Have a nice day!");
				sc.close();
				break;
			}

			int maxday = pc.return_Maxday(year, month);

			System.out.printf("  << %4d년 %d월 달력 >>", year, month);
			System.out.println("");

			System.out.println(" SU MO TU WE TH FR SA");
			System.out.println(" --------------------");

			
			
			for (i = 0; i < weekday; i++) {
				System.out.print("   ");
			}

			for (i = 1; i <= count; i++) {
				System.out.printf("%3d", i);
			}

			System.out.println("");
			for (i = count + 1; i <= maxday; i++) {
				System.out.printf("%3d", i);
				if (i % 7 == delim) {
					System.out.println("");
				}
			}
			System.out.println("");
			System.out.println("");

		}
		sc.close();

	}

	public static void main(String[] args) {
		runPrompt();
	}
}
