import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int time = sc.nextInt();
		
		int total = a*60 + b + time;
		
		int hour = total/60;
		if(hour>=24) {
			hour -=24;
		}
		int min = total%60;
		
		System.out.println(hour + " " + min);
	}
}