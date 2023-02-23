package problem_solvings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS002SimpleArraySum {
	public static void main(String[] args) {
		
		try (Scanner masukan = new Scanner(System.in)) {
			System.out.print("Masukkan panjang array: ");
			Integer n = masukan.nextInt();
			
			List<Integer> ar = new ArrayList<>();
			
			for (int i = 0; i < n; i++) {
				System.out.print("Masukkan nilai pada array: ");
				ar.add(masukan.nextInt());
			}
			
			//======================================================
			
			Integer sum = 0;
			
			for (int i = 0; i < ar.size(); i++) {
				sum += ar.get(i);
			}
			
			System.out.println(sum);
		}
		
	}
}
