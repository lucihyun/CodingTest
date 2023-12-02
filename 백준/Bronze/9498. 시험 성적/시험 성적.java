import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char result;
		
		if(score>=90 && score<=100) {
			result = 'A';
		}else if(score<=89 && score>=80) {
			result = 'B';
		}else if(score<=79 && score>=70) {
			result = 'C';
		}else if(score<=69 && score>=60) {
			result = 'D';
		}else {
			result = 'F';
		}
		System.out.println(result);
	}
}