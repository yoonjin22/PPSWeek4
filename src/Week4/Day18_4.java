package Week4;
import java.util.*;
public class Day18_4 {
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
	    public boolean hasCycle(ListNode head) {
	        
	        ListNode runner_1 = head;
	        ListNode runner_2 = head;
	        
	        if (head == null){
	            return false;
	        }
	        if (head.next == null){
	            return false;
	        }
	        
	        while(runner_2.next != null && runner_2.next.next != null){
	            runner_1 = runner_1.next;
	            runner_2 = runner_2.next.next;
	            
	            if(runner_1 == runner_2){
	                return true;
	            }            
	        }
	        return false;

	    }
	}

