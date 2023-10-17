import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>=1 && b>0 && b<=10000) {
			System.out.println( (a+b) + "\n" + (a-b) + "\n" + (a*b) + "\n" + 
								(a/b) + "\n" + (a%b));
		}
	}
}