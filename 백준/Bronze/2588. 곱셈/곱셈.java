import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		String b = sc.nextLine();
        
        String[] arr = b.split("");
        for(int i=2; i>=0; i--) {
            System.out.println(a * Integer.parseInt(arr[i]));
        }
        System.out.print(a * Integer.parseInt(b));
		}
}