package deutsche;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner("James Bond 007");
		String output = scan.findInLine("\\s*[A-Z][a-z]*\\s");
		System.out.println("'"+ output+"'");
		scan.close();
	}
}
