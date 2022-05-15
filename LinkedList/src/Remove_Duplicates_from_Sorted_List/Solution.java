package Remove_Duplicates_from_Sorted_List;


import Base_Classes.ListNode;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result=head;
        if(head==null || head.next==null) return head;

        while (result.next!=null){
            if(result.val==result.next.val){
                result.next=result.next.next;
                continue;
            }
            result=result.next;
        }

        return head;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        ListNode head=ListNode.createLinkedList(new int[]{1,1,1,2,2});
        solution.deleteDuplicates(head);
    }
}