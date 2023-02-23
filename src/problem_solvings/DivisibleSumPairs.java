package problem_solvings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisibleSumPairs {
	public static void main(String[] args) {
		
		try (Scanner masukan = new Scanner(System.in)) {
			System.out.print("Masukkan panjang array: ");
			Integer n = masukan.nextInt();
			
			System.out.print("Masukkan jumlah yang diharapkan: ");
			Integer k = masukan.nextInt();
			
			List<Integer> ar = new ArrayList<>();
			
			for (int i = 0; i < n; i++) {
				System.out.print("Masukkan nilai integer: ");
				ar.add(masukan.nextInt());
			}
			
			//===========================================================
			
			Integer count = 0;
			Integer max = 0;

			List<Integer> arAdd = new ArrayList<>();
			
			System.out.println(max);
			System.out.println();
			
			for (int i = 0; i < ar.size(); i++) {
				for (int j = 0; j < ar.size(); j++) {
					Integer temp = ar.get(i) + ar.get(j);
					if (i != j && i < j) {
						arAdd.add(temp);
						if (temp > max) {
							max = temp;
						}
					}
				}
			}
			
			System.out.println("Array add: " + arAdd);
			System.out.println();
			
			System.out.println("Nilai max penjumlahan: " + max);
			System.out.println();
			
			for (int i = 0; i < arAdd.size(); i++) {
				for (int j = k; j <= max; j += k) {
					if (arAdd.get(i) == j) {
						count++;
					}
				}
			}
			
			System.out.println(count);
		}
		
	}
}
