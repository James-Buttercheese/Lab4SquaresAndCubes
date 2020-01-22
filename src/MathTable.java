import java.util.Scanner;

/*
 * @published by James McDowell
 */
public class MathTable {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Learn some math!!!");
		
		char yesOrNo = 'y';		
		
		while (yesOrNo == 'y') {		 
		
			System.out.println("Enter an intiger:...");
			int number = scnr.nextInt();
			
			
			if (number > 0) { //for positive intigers
						
				System.out.println("Number  Square  Cube   Multiply");
				System.out.println("======  ======  ====   ========");
				
				for (int i = 1; i <= number; i++) {
					System.out.printf("%-8d", i);
					System.out.printf("%-8d", (i*i));
					System.out.printf("%-7d", (i*i*i));
					System.out.println(i*number);
				}
			} else if (number < 0) { //for negative intigers
				System.out.println("Number  Square  Cube   Multiply");
				System.out.println("======  ======  ====   ========");
				
				for (int i = 1; i >= number; i--) {
					System.out.printf("%-8d", i);
					System.out.printf("%-8d", (i*i));
					System.out.printf("%-7d", (i*i*i));
					System.out.println(i*number);
				}
			} else { //for zero
					System.out.println("Zero will not work.");
				}
		
		System.out.println("Would you like to try again?  y or n");
		yesOrNo = scnr.next().charAt(0);
		
		}
	System.out.println("Goodbye");
 }
}