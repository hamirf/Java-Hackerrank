package problem_solvings;

import java.util.Scanner;

public class PS025CatsAndAMouse {
	public static void main(String[] args) {
		
		try (Scanner masukan = new Scanner(System.in)) {
			System.out.print("Masukkan banyaknya kompetisi: ");
			int n = masukan.nextInt();
			
			int[] xyz = new int[3];
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < xyz.length; j++) {
					if (j == 0) {
						System.out.print("Masukkan posisi Cat A: ");					
					} else if (j == 1) {
						System.out.print("Masukkan posisi Mouse C: ");
					} else {
						System.out.print("Masukkan posisi Cat B: ");
					}
					xyz[j] = masukan.nextInt();
				}
				int x = xyz[0];
				int y = xyz[1];
				int z = xyz[2];
				
			    //=======================================================
				
				String result = "";
			    int catAPos = Math.abs(z - x);
			    int catBPos = Math.abs(z - y);
			    
			    if (catAPos < catBPos) {
			        result = "Cat A";
			    } else if (catAPos > catBPos) {
			        result = "Cat B";
			    } else if (catAPos == catBPos) {
			        result = "Mouse C";
			    }
			    
			    System.out.println(result);
			}
		}
		
	}
}
