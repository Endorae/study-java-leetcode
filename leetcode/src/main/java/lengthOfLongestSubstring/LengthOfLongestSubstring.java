package lengthOfLongestSubstring;

public class LengthOfLongestSubstring {

	
	 public int lengthOfLongestSubstring(String s) {
		 if(s == null || s.length() <= 0)
		 {
			 return 0;
		 }	
		 
		 int result = 1;	
		 		 		 
		 int length = 1;		 
		 int start = 0;		 		 
		
		 
		 for(int i= 0; i < s.length();){			 
			 if(start + result > s.length())
		     {
		    	 break;
		     }
			 if(i>= s.length() - 1)
			 {
				 length = i - start  + 1;	
				 if(length > result){
						result = length;
					}
			 }
			 char ch = s.charAt(i);	
			 
			 int indexOfChar = 	s.indexOf(ch, start);		
			 
			 if(indexOfChar != i) {				 
				 length = i - start ;	
			     start = indexOfChar + 1;
			     i = start;
			     
			     if(length > result){
						result = length;
					}			     			     
			 }
			 else {
				i++;						
			 }				 
		 }
		 
		 return length;
	 }
	
}
