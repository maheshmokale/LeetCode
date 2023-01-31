package Medium.Swap_Nodes_in_Pairs;


//Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev=null;
        ListNode next=null;
        ListNode curr=head;
        ListNode finalNode=null;
        ListNode temp=null;
        int count=0;
        while(curr!=null){
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
           count++;
           if(count%2==0){
               if(finalNode==null){
                   temp=prev;
                   finalNode=temp;
               }
               else{
                   temp=temp.next.next=prev;

               }
               prev=null;
           }
        }
        if(prev!=null)
            temp.next.next=prev;
        return finalNode;
    }
    public static void main(String[] arga){
        Solution solution=new Solution();
        int[] input={1,2,3};
        ListNode head=solution.getList(input);
        solution.swapPairs(head);
    }
    public ListNode getList(int[] input){
        ListNode list=null;
        ListNode temp=null;
        for(int val:input){
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