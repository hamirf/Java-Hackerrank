package problem_solvings;

import java.util.Scanner;

public class PS024ElectronicsShop {
	public static void main(String[] args) {
		
		try (Scanner masukan = new Scanner(System.in)) {
			System.out.print("Masukkan uang: ");
			Integer b = masukan.nextInt();
			
			System.out.print("Masukkan banyak Keyboard: ");
			int k = masukan.nextInt();
			
			System.out.print("Masukkan banyak USB Drive: ");
			int u = masukan.nextInt();
			
			masukan.nextLine();
			
			System.out.print("Masukkan harga keyboard: ");
			String[] keyboards = masukan.nextLine().split(" ", k);
			
//		masukan.nextLine();

			System.out.print("Masukkan harga usb drive: ");
			String[] drives = masukan.nextLine().split(" ", u);
			
//		System.out.print("Masukkan banyak Keyboard: ");
//		int k = masukan.nextInt();
//		
//		System.out.print("Masukkan banyak USB Drive: ");
//		int u = masukan.nextInt();
//		
//		int[] keyboards = new int[k];
//		int[] drives = new int[u];
//		
//		for (int i = 0; i < k; i++) {
//			System.out.print("Masukkan harga keyboard: ");
//			keyboards[i] = masukan.nextInt();
//		}
//
//		for (int i = 0; i < u; i++) {
//			System.out.print("Masukkan harga usb drive: ");
//			drives[i] = masukan.nextInt();
//		}
			
			//======================================================
			
			int maxSpent = 0;
			
//		for (int i = 0; i < keyboards.length; i++) {
//			System.out.println(keyboards[i]);
//		}
			
			for (int i = 0; i < keyboards.length; i++) {
				int kPrice = Integer.parseInt(keyboards[i]);
				for (int j = 0; j < drives.length; j++) {
					int dPrice = Integer.parseInt(drives[j]);
					int temp = kPrice + dPrice;
					if (temp > maxSpent && temp <= b) {
						maxSpent = kPrice + dPrice;
					} else if (maxSpent == 0) {
						maxSpent = -1;
					}
				}
			}
			
			System.out.println(maxSpent);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
