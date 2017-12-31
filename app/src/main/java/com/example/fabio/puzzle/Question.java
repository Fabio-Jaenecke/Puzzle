import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Question {
	static void agecheck() {
		int age;
		System.out.println("Enter verification age...");
		Scanner varibl3 = new Scanner(System.in);
		int ageZ = varibl3.nextInt();
		if (ageZ == 16) {
			age = 16;
		} else if (ageZ == 18) {
			age = 18;
		}
		System.out.println("Again please...");
		Scanner varibl2 = new Scanner(System.in);
		age = varibl2.nextInt();
		System.out.println(varibl2.nextLine());
		Timer t = new Timer();
		do {

			//Varibl2 check for rules related to age
			switch (age) {
				case 16: {
					System.out.println("This is the minimum legal age of buying beer");
					t.schedule(new TimerTask() {
						public void run() {
							System.out.println("If you want to see another allowance, please type '18'?");
						}
					}, 4000);
					System.out.println(varibl2.nextLine());
					return;
				}
				case 18: {
					System.out.println("This is the minimum legal age of buying vodka");
					t.schedule(new TimerTask() {
						public void run() {
							System.out.println("If you want to see another allowance, please type '16'?");
						}
					}, 4000);
					System.out.println(varibl2.nextLine());
					return;
				}
				default: {
					System.out.println("Drinking allowances are defined for the ages '16' and '18'. To see allowances, please type '16' or '18'");
					System.out.println(varibl2.nextLine());
				}

			}

		} while (ageZ == 16 || ageZ == 18) ;
	}
}
/*
			
	}

	
	
	
	public static void main (String[] args) {
		System.out.println("Welcome. You can now verify drinking allowances. Please enter your age...");
		//Varibl2 for Scanner shall define the users own age
		agecheck();
	}
			
		//If Else
			


		} 
		else {
			System.out.println("Error");
			}

			
		//Switch Case
		
		
		
			
		}
		
		
		
}

*/