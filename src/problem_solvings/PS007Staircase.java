package problem_solvings;

import java.util.Scanner;

public class PS007Staircase {
	public static void main(String[] args) {
		
		try (Scanner masukan = new Scanner(System.in)) {
			System.out.print("Masukkan banyak anak tangga: ");
			Integer n = masukan.nextInt();
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i + j >= (n - 1)) {
						System.out.print("#");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}
