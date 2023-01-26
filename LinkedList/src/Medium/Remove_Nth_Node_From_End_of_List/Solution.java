package Medium.Remove_Nth_Node_From_End_of_List;


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public static void main(String[] args){
        Solution solution=new Solution();
        int[] input={1,2};
        ListNode head=solution.getListNode(input);
        solution.removeNthFromEnd(head,2);
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        ListNode slow=head;
        if(head.next==null && n==1) return null;
        int count=0;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            count+=2;
        }
        if(fast!=null)
            count+=1;
        int tot=count-n;
        for (int i = 1; i < tot; i++) {
            slow=slow.next;
        }
        if(tot==0){
            return head.next;
        }
        slow.next=slow.next.next;
        return head;
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