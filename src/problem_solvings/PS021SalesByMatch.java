package problem_solvings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS021SalesByMatch {
	public static void main(String[] args) {
		
		try (Scanner masukan = new Scanner(System.in)) {
			System.out.print("Masukkan banyaknya kaos kaki: ");
			Integer n = masukan.nextInt();
			
			List<Integer> ar = new ArrayList<>();
			
			for (int i = 0; i < n; i++) {
				System.out.print("Masukkan integer warna kaos kaki: ");
				ar.add(masukan.nextInt());
			}
			
			//================================================================
			
			Integer count = 0;
			
			for (int i = 0; i < ar.size(); i++) {
				Integer temp = 0;
				for (int j = 0; j < ar.size(); j++) {
					if (ar.get(i) < ar.get(j)) {
						temp = ar.get(j);
						ar.set(j, ar.get(i));
						ar.set(i, temp);
					}
				}
			}
			
			System.out.println(ar);
			
			for (int i = 0; i < ar.size() - 1; i++) {
				if (ar.get(i) == ar.get(i + 1)) {
					count++;
					i = i + 1;
				}
			}
			
			System.out.println(count);
		}
		
	}
}
