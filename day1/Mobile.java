package week1.day1;

public class Mobile {
	public void makeCall() {
		System.out.println("Mobile is used to makecall");
		String mobileModel="RealmeXT";
		float mobileWeight=14.5f;
		System.out.println("to make call");
	}	
	public void sendMsg() {
		boolean isFullcharged=true;
		int mobileCost =18000;
	}
 public static void main(String[] args) {
	Mobile obj=new Mobile();
	obj.makeCall();
	
	obj.sendMsg();
	
	System.out.println("This is my mobile");
	
}
}
