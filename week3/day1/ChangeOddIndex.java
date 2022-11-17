package week3.day1;

public class ChangeOddIndex {

	public static void main(String[] args) {
		
	       String test="changeme";
	       char[] charArray = test.toCharArray();
	       for (int i = 0; i < charArray.length; i++) {
	    	   if(i % 2 == 1)
	    	   {
	    		   System.out.println(Character.toUpperCase(charArray[i]));
	    	   }
	    	   else
	    	   {
	    		   System.out.println(charArray[i]);
		}
	
	}
		
		
		
	}

}
