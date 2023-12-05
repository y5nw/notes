import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int myNumber = scanner.nextInt();
		System.out.println(input + "\n" + myNumber);
	}
}
