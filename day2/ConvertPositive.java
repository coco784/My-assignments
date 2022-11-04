package week1.day2;

public class ConvertPositive {

	public static void main(String[] args) {
		int num = -40;
		if(num<0)
		{
		num = 0 -(num);
System.out.println("the converted num is"+ " " +num);
		}
		else
		{
			System.out.println("the given no is positive"+" "+num);
		}
	}
}