package problem_solvings;

import java.util.Scanner;

public class PS022DrawingBook {
	public static void main(String[] args) {

		try (Scanner masukan = new Scanner(System.in)) {
			System.out.print("Masukkan jumlah halaman: ");
			Integer n = masukan.nextInt();

			System.out.print("Masukkan halaman yang ingin dituju: ");
			Integer p = masukan.nextInt();

			// ===================================================================

			Integer count = 0;
			Integer revCount = 0;

			for (int i = 2; i <= p; i += 2) {
				count++;
			}
			
			if (n % 2 == 0) {
				for (int i = n - 1; i >= p; i -= 2) {
					revCount++;
				}
			} else {
				for (int i = n - 2; i >= p; i -= 2) {
					revCount++;
				}
			}

			System.out.println("Count: " + count);

			System.out.println("Reverse count: " + revCount);

			if (count <= revCount) {
				System.out.println(count);
			} else {
				System.out.println(revCount);
			}
		}

	}
}
