package week3.day2;

public class Testing extends Language implements AutomationTool{
	
	@Override
public void python() {
		System.out.println("python");
		
}
	public void selenium() {
		System.out.println("selenium");
		
	}
	  public void playwright() {
		  System.out.println("playwight");
		  
	  }
	  public static void main(String[] args) {
		  Testing obj = new Testing();
		  obj.python();
		  obj.selenium();
		  obj.playwright();
		  obj.java();
			
		}


}
