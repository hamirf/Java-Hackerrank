package problem_solvings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PS027PickingNumbers {
	public static void main(String[] args) {

		try (Scanner masukan = new Scanner(System.in)) {
			System.out.print("Masukkan panjang array: ");
			Integer n = masukan.nextInt();

			List<Integer> a = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				System.out.print("Masukkan element array: ");
				a.add(masukan.nextInt());
			}

			// ==========================================================

			// Cara 2
			Collections.sort(a);
			int max = 1;
			for (int i = 0; i < a.size(); i++) {
			    int count = 1;
			    for (int j = i + 1; j < a.size(); j++) {
			        if (Math.abs(a.get(i) - a.get(j)) <= 1) {
			            count++;
			        }
			    }
			    
			    if (count > max) {
			        max = count;
			    }
			}
			
			System.out.println(max);
		}
		
//		// Cara 1
//		Collections.sort(a);
//		System.out.println(a);
//		int start = 0;
//		int i = 0;
//		int max = 0;
//		while (i < a.size()) {
//			if (Math.abs(a.get(start) - a.get(i)) > 1) {
////				System.out.println(Math.abs(a.get(start) - a.get(i)));
//				start = i;
//			}
//			max = Math.max(max, i - start + 1);
//			System.out.println("start: " + start + " i: " + i + " max: " + max);
//			
//			i++;
//		}
//
//		System.out.println(max);

	}
}

//int longest = 0;
//int indexSum = 0;
//int auxI = 0;
//int auxI2 = 0;
//int iNow = 0;
//int subArrLong = 1;
//
//for (int i = 1; iNow < a.size() - 1; i++) {
//	int diff = Math.abs(a.get(iNow) - a.get(i));
//	// Kalau diff !<= 1, maka i pembanding ++
//
//	// Kalau diff <= 1, maka i yg dibandingkan menjadi i pembanding, i pembanding
//	// menjadi i pembanding ++
//	// subArrLong ++
//	if (diff <= 1) {
//		iNow = i;
//		subArrLong++;
//	}
//
//	// Kalau nilai i pembanding = panjang arr - 1, maka i yg dibandingkan ++ dan i
//	// pembanding = i yg dibandingkan + 1
//	// Setiap i pembanding = 5, subArrLong = 1
//	if (i == a.size() - 1) {
//		if (indexSum == a.size() - 1) {
//			auxI++;
//			iNow = auxI;
//		} else if (indexSum != a.size() - 1) {
//			iNow = auxI;					
//		}
//		i = iNow;
//		indexSum = 0;
//	}
//	
//	if (indexSum == 0) {
//		subArrLong = 1;
//	}
//
//	// Kalau subArrLong > longest, maka nilai longest menjadi subArrLong
//	if (subArrLong > longest) {
//		longest = subArrLong;
//	}
//	
//	indexSum += i;
//
//}
