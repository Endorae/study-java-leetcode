package twoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public int[] twoSum(int[] nums, int target)
    {	   
	    Map<Integer,Integer> numsMap = new HashMap<Integer,Integer> ();
	    
	    for (int i = 0; i < nums.length; i++)
	    {
	    	int num = nums[i];	    		    		    	
	    	int expectPairNum = target - num;	    	
	    		    		    	
	    	if(numsMap.containsKey(expectPairNum))
	    	{	    		   			
    			return new int[] {numsMap.get(expectPairNum),i};	    		
	    	}
	    	numsMap.put(num, i);	    		    		    
	    }
	    
	    
	    return new int[2];
    }
	
//	 public int[] twoSum(int[] nums, int target)
//	    {
//		    int[] result = new int[2];
//		    if(null == nums)
//		    {
//		    	return result;
//		    }
//	     
//		    for (int i = 0; i < nums.length; i++)
//		    {
//		    	 int sumIndexStart = i + 1;
//		    	 
//		    	
//		    	 for (int j = sumIndexStart ; j < nums.length; j++)
//		    	 {		    		
//		    		 if((nums[i] + nums[j]) == target)
//		    		 {
//		    			 result[0] = i;
//		    			 result[1] = j;
//		    			 
//		    			 break;
//		    		 }
//		    	 }
//	    
//		    }
//		    
//		    return result;
//	    }
}


//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//           int[] result = new int[2];
//		    
//	        if(null == nums || nums.length < 2)
//	        {
//	        	return result;
//	        }
//	        
//	        
//	        HashMap<Integer,Integer> bufferNums = new HashMap(); 
//	        
//	        int minNum = 0; 
//	        int maxNum = 0;
//	        
//	        if(target < minNum)
//	        {
//	        	minNum = target;        	
//	        }
//	        else
//	        {
//	        	maxNum = target;
//	        }
//	        
//	        
//	        int middle = nums.length/2;
//	        for (int i = 0; i < middle; i++) {
//	        	
//	        	int num_left = nums[i];
//			    if( num_left <= target || 1==1)
//			    {
//			    	Integer bufferNumIndex =  bufferNums.get(num_left);
//			    	if(null!=bufferNumIndex)
//			    	{
//			    		if(num_left * 2 == target)
//			    		{
//			    			result[0]  = bufferNumIndex;
//			        		result[1]  = i;
//			    		}
//			    		
//			    		break;
//			    	}
//			    	
//			    	bufferNums.put(num_left, i);
//			    	
//			    	if(num_left < minNum)
//			    	{
//			    		minNum = num_left;
//			    	}
//			    }
//			    
//			    int right_index = nums.length-i -1;
//			    int num_right = nums[right_index];
//			    if(num_right <= target|| 1==1)
//			    {
//			    	Integer bufferNumIndex =  bufferNums.get(num_right);
//			    	if(null!=bufferNumIndex)
//			    	{
//			    		if(num_right * 2 == target)
//			    		{
//			    			result[0]  = bufferNumIndex;
//			        		result[1]  = right_index;
//			    		}
//			    		
//			    		break;
//			    	}
//			    	
//			    	bufferNums.put(num_right, right_index);
//			    	
//			    	if(num_right < minNum)
//			    	{
//			    		minNum = num_right;
//			    	}
//			    }			    
//			  }
//	        
//	        if(result[0] != result[1])
//	        {
//	        	return result;
//	        }
//	        
//	        if(nums.length%2==1)
//	        {
//	        	bufferNums.put(nums[middle] , middle);
//	        }
//	        
//	      
//	        for (int i = minNum; i < maxNum; i++) {
//	        	Integer target_left = bufferNums.get(i);
//	        	Integer target_right = bufferNums.get(target-i);
//	        	
//	        	if(null != target_left && null != target_right)
//	        	{
//	        		result[0]  = target_left;
//	        		result[1]  = target_right;
//	        		
//	        		break;
//	        	}
//	        	
//	        }
//	        
//	        return result;
//    }
//}
