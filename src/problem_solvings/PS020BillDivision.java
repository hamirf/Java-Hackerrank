package problem_solvings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS020BillDivision {
	public static void main(String[] args) {
		
		try (Scanner masukan = new Scanner(System.in)) {
			System.out.print("Masukkan banyak item: ");
			Integer n = masukan.nextInt();
			
			System.out.print("Masukkan index item yang tidak dimakan Anna: ");
			Integer k = masukan.nextInt();

			List<Integer> bill = new ArrayList<>();
			
			for (int i = 0; i < n; i++) {
				System.out.print("Masukkan harga per item: ");
				bill.add(masukan.nextInt());
			}
			
			System.out.print("Masukkan bill yang diminta Brian dari Anna: ");
			Integer b = masukan.nextInt();
			
			//=========================================================================
			
			Integer actualB = 0;
			Integer refund = 0;
			
			for (int i = 0; i < bill.size(); i++) {
				if (i != k) {
					actualB += bill.get(i);
				}
			}
			
			actualB /= 2;
			refund = b - actualB;
			if (refund == 0) {
				System.out.println("Bon Appetit");
			} else {
				System.out.println(refund);
			}
		}
		
	}
}
