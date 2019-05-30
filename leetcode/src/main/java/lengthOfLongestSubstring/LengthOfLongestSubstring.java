package lengthOfLongestSubstring;

public class LengthOfLongestSubstring {

	public int lengthOfLongestSubstring(String s) {
		
		int fromIndex = 0;
		int length = 0;
		int maxlength = 0;
		
		int stringLength = s.length();
		
		for(int i= 0; fromIndex < stringLength - maxlength; i++) {
			
			int pos = s.indexOf(s.charAt(i),fromIndex);
						
			if (pos != i) {				
				
				fromIndex = pos + 1;
			}
			
 			length = i - fromIndex + 1;
			if(length > maxlength)
			{
				maxlength = length;
			}
			
		}
		return maxlength;
	}
	
}
