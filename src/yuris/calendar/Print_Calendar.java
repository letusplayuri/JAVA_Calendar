package yuris.calendar;

import java.util.Scanner;

public class Print_Calendar {
	
	public final static String prompt = "Cal> ";
	//변수선언
	public static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	//윤년 변수선언
	public static int[] leap_days = {31,29,31,30,31,30,31,31,30,31,30,31};
	public static boolean isLeap_year(int num) {
		if (num % 400 == 0){
			return true;
		} else if (num%4 == 0 && num%100 == 0 ) {
			return false;
		} else if (num%4 == 0) {
			return true;
		} else
			return false;
	}
	
	//최대 일수 반환 함수
	
	public static int return_Maxday(int year, int num) {
		if (isLeap_year(year)==true) { //윤년이면 윤년 일수가져옴
			return leap_days[num-1];
		}else
		return days[num-1];
	}
	
	public static void runPrompt() {
		Scanner sc = new Scanner(System.in);

		// 종료조건 -1 을 이용해 반복하기
		while (true) {
			System.out.println("년도를 입력하세요.");
			System.out.print(prompt);
			// 숫자를 입력받음
			Print_Calendar pc = new Print_Calendar();
			int year = sc.nextInt();
			
			System.out.println("월을 입력하세요.");
			System.out.print(prompt);
			// 숫자를 입력받음

			int month = sc.nextInt();
			if (month==-1) {
				System.out.println("Have a nice day!");
				sc.close();
				break;				
			}
		
			int maxday = pc.return_Maxday(year, month);
			
			
			System.out.printf("  << %4d년 %d월 달력 >>", year, month);
			System.out.println("");
			
			System.out.println(" SU MO TU WE TH FR SA");
			System.out.println(" --------------------");
			for(int i=1; i<=maxday; i++) {
				System.out.printf("%3d",i);
				if (i%7==0) {
					System.out.println("");
				}	
			}
			System.out.println("");

		}

	}
	public static void main(String[] args) {
		runPrompt();
	}
}
