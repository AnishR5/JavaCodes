package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class A1MergeTwoSortedList  {
	  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        ListNode ans=new ListNode();

	        while(list1.next!=null && list2.next!=null)
	        {
	            if(list1.val<=list2.val)
	            {
	                ans.next=list1;
	                list1=list1.next;
	            }
	            else{
	                ans.next=list2;
	                list2=list2.next;
	            }
	            ans=ans.next;
	        }

	        if(list1.next!=null)
	            ans.next=list1;
	        if(list2.next!=null)
	            ans.next=list2;
	        
	        return ans;
	        
	    }

	public static void main(String[] args) {
		List<Integer> list1=new LinkedList<Integer>(Arrays.asList(1,2,4));
		List<Integer> list2=new LinkedList<Integer>(Arrays.asList(1,3,4));
		

	}

}
