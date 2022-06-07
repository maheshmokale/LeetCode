package Easy.Remove_Linked_List_Elements;


 // Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        while(head!=null && head.val==val)
            head=head.next;
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.next.val==val){
                temp.next=temp.next.next;
            }
            else
                temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        ListNode head=createLinkedList(new int[]{7,7,7,7});
        int val=7;
        solution.removeElements(head ,val);
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