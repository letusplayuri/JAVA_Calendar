package yuris.calendar;

import java.util.*;

public class Repeat_n {

	// 변수선언
	public static int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	// 최대 일수 반환 함수

	public static int return_Maxday(int num) {
		return days[num - 1];
	}

	public static void main(String[] args) {
		String PROMPT = "Cal> ";
		Scanner sc = new Scanner(System.in);

		// 종료조건 -1 을 이용해 반복하기
		while (true) {
			
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT);
			// 숫자를 입력받음
			Repeat_n rn = new Repeat_n();
			int month = sc.nextInt();
			if (month==-1) {
				System.out.println("Have a nice day!");
				sc.close();
				break;				
			}
			System.out.println(month + "월은 " + rn.return_Maxday(month) + "일까지 있습니다.");
		}

	}

}
