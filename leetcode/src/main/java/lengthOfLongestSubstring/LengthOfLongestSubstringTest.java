package lengthOfLongestSubstring;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LengthOfLongestSubstringTest {

	
	@ParameterizedTest
	@MethodSource("providerLengthOfLongestSubstringTestCase")	
	void test(String input,int exceptedResult) {
		
		int test = "abcdefgh".indexOf('e', 2);
		int result = new LengthOfLongestSubstring().lengthOfLongestSubstring(input);
		assertEquals(exceptedResult,result); 
	}
	
	@SuppressWarnings("unused")
	private static Stream<Arguments> providerLengthOfLongestSubstringTestCase() {
	    return Stream.of(
	    		Arguments.of("ABCDE", 5),
	    		Arguments.of("a", 1),
	    		Arguments.of("aa", 1),
	    		Arguments.of("aA", 2),
	    		Arguments.of("AABB", 2),
	    		Arguments.of("", 0),
	    		Arguments.of("dvdf", 3),
	    		Arguments.of("ABCDCEEFADEAB", 4),
	    		Arguments.of("abcdefghijkmlnopqrstuvwxyz1234567890!@#$%^&*()ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijkmlnopqrstuvwxyz1234567890!@#$%^&*()ABCDEFGHIJKLMNOPQRSTUVWXYZ", 72)
	    		
				);	    		
	}	
}
