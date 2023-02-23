package problem_solvings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS018MigratoryBirds {
	public static void main(String[] args) {

		try (Scanner masukan = new Scanner(System.in)) {
			System.out.print("Masukkan jumlah burung yang migrasi: ");
			Integer n = masukan.nextInt();

			List<Integer> arr = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				System.out.print("Masukkan tipe burung: ");
				arr.add(masukan.nextInt());
			}

			// ==================================================

//		List<Integer> arrNoDupe = new ArrayList<>();
			Integer freq = 1;
			Integer lowest = 0;

			for (int i = 1; i <= 5; i++) {
				Integer tempFreq = 1;
				for (int j = 0; j < arr.size(); j++) {
					if (arr.get(j) == i) {
						tempFreq++;
					}
					if (tempFreq > freq) {
						freq = tempFreq;
						lowest = i;
					} else if (tempFreq == freq) {
						if (i < lowest) {
							lowest = i;
						}
					}
				}
			}

			System.out.println(lowest);
		}
	}
}
