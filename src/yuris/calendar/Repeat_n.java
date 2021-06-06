package yuris.calendar;
import java.util.*;

public class Repeat_n {
	
	//변수선언
	public static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	//최대 일수 반환 함수
	
	public static int return_Maxday(int num) {
		return days[num-1];
	}

	public static void main(String[] args) {

		// 월 입력받는 걸 N번 반복하도록 프로그램 변경하기
		System.out.println("반복횟수를 입력하세요.");
		//숫자를 입력받음
		Scanner sc = new Scanner(System.in);
		int num_of_repeat = sc.nextInt();
		
		
		int max_days[] = new int[num_of_repeat];
		int i = 0;
		while(i<num_of_repeat) {
			max_days[i] = sc.nextInt();
			i = i+1;
		}
		
		Repeat_n rn = new Repeat_n();
		for(i=0; i<num_of_repeat; i++) {
			System.out.println(max_days[i] + "월은 " + rn.return_Maxday(max_days[i]+1) + "일 입니다.");
		}
		

	}

}
