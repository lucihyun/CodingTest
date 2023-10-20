import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		
		if(id.equals(id.toLowerCase()) && id.length()<=50) System.out.println(id + "??!");
	}
}