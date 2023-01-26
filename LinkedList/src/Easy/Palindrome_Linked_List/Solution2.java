package Easy.Palindrome_Linked_List;

import java.util.Stack;

public class Solution2 {
    public static void main(String[] args){
        Solution2 solution2=new Solution2();
        int[] input={1,2};
        ListNode head=solution2.getListNode(input);
        System.out.println(solution2.isPalindrome(head));
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        Stack<Integer> stackStore=new Stack<>();
        while (fast!=null && fast.next!=null){
            stackStore.push(slow.val);
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast!=null)
            slow=slow.next;
        while(slow!=null){
            if(slow.val!=stackStore.pop())
                return false;
            slow=slow.next;
        }
        return true;
    }
    public ListNode getListNode(int[] input){
        ListNode list=null;
        ListNode temp=null;
        for (int val:input){
            if(list==null){
                list=new ListNode(val);
                temp=list;
            }
            else{
                temp.next=new ListNode(val);
                temp=temp.next;
            }
        }
        return list;
    }
}
