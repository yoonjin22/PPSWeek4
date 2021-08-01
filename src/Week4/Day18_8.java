package Week4;

public class Day18_8 {
	
	class ListNode {

	    int data;
	    ListNode next;

	    public ListNode(int data, ListNode next) {
	        this.data = data;
	        this.next = next;
	    }

	    public ListNode(int data) {
	        this.data = data;
	        this.next = null;
	    }

	}
	  public ListNode detectCycle(ListNode head) {
	        if (head == null || head.next == null) {
	            return null;
	        }
	        ListNode slow = head;
	        ListNode fast = head;
	        while (fast != null && fast.next != null) {//null
	            slow = slow.next;
	            fast = fast.next.next;
	            if (slow == fast) {//
	                slow = head;//
	                while (slow != fast) {//
	                    slow = slow.next;
	                    fast = fast.next;
	                }
	                return slow;
	            }
	        }
	        return null;
	    }
}
