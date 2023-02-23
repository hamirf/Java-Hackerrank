package problem_solvings;

import java.util.Scanner;

public class PS001SolveMeFirst {
	public static void main(String[] args) {
		
		try (Scanner masukan = new Scanner(System.in)) {
			System.out.print("Masukkan nilai a: ");
			Integer a = masukan.nextInt();

			System.out.print("Masukkan nilai b: ");
			Integer b = masukan.nextInt();
			
			//========================================
			
			System.out.println(a + b);
		}
		
	}
}
