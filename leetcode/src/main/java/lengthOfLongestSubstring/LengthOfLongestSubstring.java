package lengthOfLongestSubstring;


import java.util.HashMap;

import java.util.Map;

public class LengthOfLongestSubstring {

	 public int lengthOfLongestSubstring(String s) {
		 
		 char [] stringArr = s.toCharArray();
		 
		 if(stringArr.length <= 1)
		 {
			 return stringArr.length;
		 }
		 
		 Map<Character,Integer> charMap = new HashMap<Character,Integer> (stringArr.length);
		 
		 
		 int maxLength = 1;
		 charMap.put(stringArr[0], 0);
		
		 
		for(int i=1; i < stringArr.length;i++ )
		{	
			
			if(!charMap.containsKey(stringArr[i]))
			{
			   charMap.put(stringArr[i], i);
			   maxLength++;
			}	
			else
			{
				int length = lengthOfLongestSubstring(s.substring(charMap.get(stringArr[i]) + 1));
				if(length > maxLength)
				{
					maxLength = length;
				}
				break;
			}
		}
		
	        
		 return maxLength;
	    }
	 
	
}
