package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Goal: To find whether a number is a Prime number or not
		 * 
		 * input: 13
		 * output: 13 is a Prime Number
		 * 
		 * Shortcuts:
		 * 1) Print : type: syso, followed by: ctrl + space + enter
		 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
		 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
		 *   
		 
		 */

		

		


			// Declare an int Input and assign a value 13

			int input=13;
			

			// Declare a boolean variable flag as false

			boolean flag = false;

			// Iterate from 2 to half of the input

			for (int i = 2; i < input/2; i++) {
				int remainder = input % i;
				
				if(remainder==0) {
				flag=true;
			break;
			}
			}
			if(flag=true) {
				System.out.println("It is prime number");// Divide the input with each for loop variable and check the remainder
			}

				

				// Set the flag as true when there is no remainder
					
				// break the iterator
			else {System.out.println("It is not prime number");
			
			
			
			
			
			
			
			
			
		
			}

			// Check the flag (Provide a condition)

			

				// Print 'Prime' when the condition matches

				

				// Print 'Not a Prime' when the condition doesn't match 

	   }
}