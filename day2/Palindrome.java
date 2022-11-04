package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		/*Check the given number is palindrome or not 

Int num =34343  

Initialize a  temporary variable.

Reverse the number (using for loop and add to the temporary variable)

Compare the temporary number with reversed number

If both numbers are same, print "palindrome number"


Else print "not palindrome number"*/
		int num = 34343;
		int rev=num,rem;
		int temp = 0;
		for (int i = 0; num > 0; i++) {
			rem=num%10;
			temp=(temp*10)+rem;
			num=num/10;
			
		} 
			if (temp==rev) {
				System.out.println("It is palindrome number");
			}

else {
		System.out.println("Not palindrome");	

	}

	}
}