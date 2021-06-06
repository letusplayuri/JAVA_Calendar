package yuris.calendar;
import java.util.*;
public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,sum = 0;
		String str = "";
		String[] str_arr;
		System.out.println("두 수를 입력하세요.");
		str = sc.nextLine();
		
		str_arr = str.split(" ");
		x = Integer.parseInt(str_arr[0]);
		y = Integer.parseInt(str_arr[1]);
		sum = x+y;
		
		System.out.println("두 수의 합은 " + sum + "입니다.");
		sc.close();

	}

}
