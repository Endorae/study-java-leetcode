package twoSum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoSumTest {
	@Test
	void test01() {
		
		int[] nums = new int[] {-3,0,3};
		int target = 0;
		
		int[] result = new TwoSum().twoSum(nums, target);
		
		assertEquals(2, result.length);
		

	
		assertTrue(
				( result[0]==0 && result[1] ==2)
				||
				( result[0]==2 && result[1] ==0)
				);
	
	}
	@Test
	void test02() {
		
		int[] nums = new int[] {3,3};
		int target = 6;
		
		int[] result = new TwoSum().twoSum(nums, target);
		
		assertEquals(2, result.length);
		
		assertTrue(
				( result[0]==0 && result[1] ==1)
				||
				( result[0]==1 && result[1] ==0)
				);
	}
}
