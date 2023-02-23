package problem_solvings;

import java.util.Scanner;

public class PS010TimeConversion {
	public static void main(String[] args) {
		
		try (Scanner masukan = new Scanner(System.in)) {
			System.out.print("Masukkan waktu dalam format 12hr: ");
			String s = masukan.nextLine();
			
			String output = s.substring(0, 8);            
			String hh = s.substring(0, 2);
			
			if (s.contains("PM")) {
			    Integer hhInt = (Integer.parseInt(hh) + 12);
			    if (hhInt == 24) {
			        hhInt = 12;
			    }
			    hh = Integer.toString(hhInt);
			    output = output.replace(output.substring(0, 2), hh);
			}  else if (s.contains("AM")) {
			    if (hh.equals("12")) {
			        output = output.replace(output.substring(0, 2), "00");
			    }
			}
			
			System.out.println(output);
		}
		
	}
}
