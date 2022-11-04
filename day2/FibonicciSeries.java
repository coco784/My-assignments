package week1.day2;

public class FibonicciSeries {
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 *
	 */

	public static void main(String[] args) {
		
		int n1=0,sum;
		int n2=1;
		int range=8;// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

				System.out.println(n1);// Print first number
				
				for (int i = 0; i < range; i++) {
					sum=n1+n2;
					n1=n2;
					n2=sum;
					System.out.println(sum);
					
				}
				
					
					
		
	}

}
