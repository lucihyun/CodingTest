import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		// 원 알람시각을 분단위로 변환
		min += hour * 60;
		
		// 45분 앞당기기
		int alarm = min - 45;

		if(alarm >= 0) {
			hour = alarm / 60;
			min = alarm % 60;			
		}else {
			hour = 23;
			min = 60 - Math.abs(alarm % 60);
		}
		
		System.out.print(hour + " " + min);
	}
}