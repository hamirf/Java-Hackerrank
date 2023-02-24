package problem_solvings;

import java.util.Scanner;

public class PS019DayOfTheProgrammer {
	public static void main(String[] args) {
		
		try (Scanner masukan = new Scanner(System.in)) {
			System.out.print("Masukkan tahun si programmer: ");
			Integer year = masukan.nextInt();
			
			//=========================================================
			
			Integer dayOfLeapYears = 12;
			Integer dayOfNotLeapYears = 13;
			Integer dayOf1918 = 26;
			String yyyy = Integer.toString(year);
			String mm = "09";
			String day = "";
			
			if (year >= 1700 && year <=1917 && (year % 4 == 0)) {
				day += Integer.toString(dayOfLeapYears) + "." + mm + "." + yyyy;
			} else if (year >= 1919 && year <=2700 && ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))) {
				day += Integer.toString(dayOfLeapYears) + "." + mm + "." + yyyy;
			} else if (year == 1918) {
				day += Integer.toString(dayOf1918) + "." + mm + "." + yyyy;
			} else {
				day += Integer.toString(dayOfNotLeapYears) + "." + mm + "." + yyyy;
			}
			
			System.out.println(day);
		}
		
	}
}
