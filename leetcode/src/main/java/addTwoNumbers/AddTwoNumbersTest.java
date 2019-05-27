package addTwoNumbers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {

	@Test
	void test01() {
		
		ListNode l1 = new ListNode(4);
		l1.next = new ListNode(3);
		l1.next.next = new ListNode(2);
		
		ListNode l2 = new ListNode(6);
		l2.next = new ListNode(7);
		
		ListNode l3 = new AddTwoNumbers().addTwoNumbers(l1, l2);
		
		assertEquals(0, l3.val);
		assertEquals(1, l3.next.val);
		assertEquals(3, l3.next.next.val);
		assertNull(l3.next.next.next);
	}
	
	@Test
	void test02() {
		
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		ListNode l3 = new AddTwoNumbers().addTwoNumbers(l1, l2);
		
		assertEquals(7, l3.val);
		assertEquals(0, l3.next.val);
		assertEquals(8, l3.next.next.val);
		
		assertNull(l3.next.next.next);
	
	}
	
	@Test
	void test03() {
		
		ListNode l1 = new ListNode(5);				
		ListNode l2 = new ListNode(5);
		
		
		ListNode l3 = new AddTwoNumbers().addTwoNumbers(l1, l2);
		
		assertEquals(0, l3.val);
		assertEquals(1, l3.next.val);
		assertNull(l3.next.next);
	
	
	}
}
