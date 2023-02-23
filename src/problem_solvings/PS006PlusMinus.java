package problem_solvings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS006PlusMinus {
	public static void main(String[] args) {
		
		try (Scanner masukan = new Scanner(System.in)) {
			System.out.print("Masukkan banyaknya data: ");
			Integer n = masukan.nextInt();
			
			List<Integer> arr = new ArrayList<>();
			
			for (int i = 0; i < n; i++) {
				System.out.print("Masukkan angka: ");
				arr.add(masukan.nextInt());
			}
			
			float positiveVal = 0;
			float negativeVal = 0;
			float zeroVal = 0;
			
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i) > 0) {
					positiveVal++;
				} else if (arr.get(i) < 0) {
					negativeVal++;
				} else {
					zeroVal++;
				}
			}
			
			System.out.println(positiveVal / arr.size());
			System.out.println(negativeVal / arr.size());
			System.out.println(zeroVal / arr.size());
		}
		
	}
}
