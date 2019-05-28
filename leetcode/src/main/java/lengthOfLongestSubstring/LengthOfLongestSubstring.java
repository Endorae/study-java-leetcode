package lengthOfLongestSubstring;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LengthOfLongestSubstring {

	 Map<Character,ArrayList<Integer>> charMap = null;
	 public int lengthOfLongestSubstring(String s) {
		 		 
		 if(s.length() <= 1)
		 {
			 return s.length();
		 }
		 
		 setCharMap(s);
				
		 Collection<ArrayList<Integer>> coll = charMap.values();
		
		 List<ArrayList<Integer>> indexlist = coll.stream().collect(Collectors.toList());
				
		 int maxLength = getLength(indexlist);
		 			        
		 return maxLength;
		 
	    }
	 
	 private int getLength(List<ArrayList<Integer>> list)
	 {	
		
		int maxLength = 1;
		
		int start = -1;
	    int lenght = 0;
	    
		for(int i= 0; i < list.size(); )
		{	
			ArrayList<Integer> charIndexList =  list.get(i);
			
			if(charIndexList != null && charIndexList.size() > 0)
			{
				Integer index = charIndexList.get(0);
				
				
				if(index == start + 1)
				{
					lenght++;
															
					charIndexList.remove(0);
					
					if(charIndexList.size() == 0)
					{
						list.remove(i);
					}
					else
					{
						list.set(i, charIndexList);
						i++;
					}	
					
					start = index;
				}
				else
				{ 
					if(lenght > 0)
					{
						if(lenght > maxLength)
						{
							maxLength = lenght;
						}
						i = 0;
						lenght = 0;
						
					}	
					else
					{
						i++;
					}
				}
																							
				if(lenght >= list.size())
				{
					maxLength = lenght;
					break;
				}
			}
			
			
		}
		return maxLength;
		
		
	 }
	 private void setCharMap(String s)
	 {
		
		 char [] stringArr = s.toCharArray();
		 charMap = new HashMap<Character,ArrayList<Integer>> (stringArr.length);
		 
		 for(int i=0; i < stringArr.length;i++ )
			{	
			    char ch = stringArr[i];
			 	ArrayList<Integer> charIndexList = charMap.get(ch);
				if(charIndexList == null)
				{
					charIndexList = new ArrayList<Integer> ();
				  
				}	
				charIndexList.add(i);
				charMap.put(ch, charIndexList);
			}
	 }
	
}
