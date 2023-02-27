package problem_solvings;

import java.util.Scanner;

public class PS023CountingValleys {
	public static void main(String[] args) {
		
		try (Scanner masukan = new Scanner(System.in)) {
			masukan.nextLine();
			
			System.out.print("Masukkan jalur pendakian (U & D): ");
			String path = masukan.nextLine();
			
			//============================================================
			
			int seaLevel = 0;
			int valleys = 0;
			
			String[] paths = path.toLowerCase().split("");
			
			for (int i = 0; i < paths.length; i++) {
				if (paths[i].equals("u")) {
					seaLevel++;
					if (seaLevel == 0) {
						valleys++;
					}
				} else if (paths[i].equals("d")) {
					seaLevel--;
				}
			}
			
			System.out.println(valleys);
		}
		
//		System.out.print("Masukkan jumlah steps: ");
//		Integer steps = masukan.nextInt();

		
	}
}
