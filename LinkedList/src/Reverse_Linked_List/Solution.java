package Reverse_Linked_List;



//Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
      //"1 2 3 4 5"
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev=null;
        ListNode next=null;
        ListNode curr=head;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return  prev;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        ListNode head=createLinkedList(new int[]{});
        solution.reverseList(head);
    }
    public static ListNode createLinkedList(int[] list){
        ListNode temp=null;
        ListNode result=null;

        for (int val:list) {
            if(temp==null){
                temp=new ListNode(val);
                result=temp;
                continue;
            }
            else
                temp.next=new ListNode(val);
            temp=temp.next;

        }
        return result;
    }
}