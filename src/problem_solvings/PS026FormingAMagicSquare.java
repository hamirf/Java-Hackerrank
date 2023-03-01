package problem_solvings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PS026FormingAMagicSquare {
	public static void main(String[] args) {
		
		try (Scanner masukan = new Scanner(System.in)) {
			List<List<Integer>> s = new ArrayList<>();
			
			for (int i = 0; i < 3; i++) {
				List<Integer> arS = new ArrayList<>();
				for (int j = 0; j < 3; j++) {
					System.out.print("Masukkan element index ke-" + i + "," + j + ": ");
					arS.add(masukan.nextInt());
				}
				s.add(arS);
			}

			System.out.println(s);
			
			//======================================================================================
			
			int minCost = 99;
			
			List<List<Integer>> possibleMagicSquare = new ArrayList<>();
			
			possibleMagicSquare.add(0, Arrays.asList(4,9,2,3,5,7,8,1,6));
			possibleMagicSquare.add(1, Arrays.asList(2,7,6,9,5,1,4,3,8));
			possibleMagicSquare.add(2, Arrays.asList(6,1,8,7,5,3,2,9,4));
			possibleMagicSquare.add(3, Arrays.asList(8,3,4,1,5,9,6,7,2));
			possibleMagicSquare.add(4, Arrays.asList(2,9,4,7,5,3,6,1,8));
			possibleMagicSquare.add(5, Arrays.asList(6,7,2,1,5,9,8,3,4));
			possibleMagicSquare.add(6, Arrays.asList(8,1,6,3,5,7,4,9,2));
			possibleMagicSquare.add(7, Arrays.asList(4,3,8,9,5,1,2,7,6));
			
			int[] arrS = new int[9];
			int x = 0;
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					arrS[x] = s.get(i).get(j);
					x++;
				}
			}
			
			for (int i = 0; i < possibleMagicSquare.size(); i++) {
				int cost = 0;
				for (int j = 0; j < arrS.length; j++) {
					int magicSquareElement = possibleMagicSquare.get(i).get(j);
					if (arrS[j] != magicSquareElement) {
						cost += Math.abs(magicSquareElement - arrS[j]);
					}
				}
				
				if (cost < minCost) {
					minCost = cost;
				}
			}
			
			System.out.println(minCost);
		}
		
	}
}
