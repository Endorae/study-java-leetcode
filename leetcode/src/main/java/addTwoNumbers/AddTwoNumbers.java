package addTwoNumbers;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers 
{
	 public  ListNode addTwoNumbers(ListNode l1, ListNode l2) 
	 {
		 ListNode l3 = new ListNode(0);
		
		
		 for(ListNode l3_current = l3 ; null != l3_current;  l3_current = l3_current.next  )			
		 {
			 int value1 = l1 == null? 0: l1.val;			 
			 int value2 = l2 == null? 0: l2.val;	
			 
			 l3_current.val = value1 + value2 + l3_current.val;	
			 
			 boolean isCarry = false;
			 
			 if(l3_current.val  >= 10)
			 {
				 isCarry = true;
				 l3_current.val -= 10;
			 }
			
			 l1 = l1 == null? null : l1.next;
			 l2 = l2 == null? null : l2.next;
			 						 			 						 
			 if(l1 !=null || l2 != null || isCarry)
			 {
				 l3_current.next = new ListNode(isCarry ? 1:0);					
			 }			
		 }
		 
	      return l3;
	 }
	 
	
	 
	
}
