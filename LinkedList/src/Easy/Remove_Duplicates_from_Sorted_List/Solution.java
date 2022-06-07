package Easy.Remove_Duplicates_from_Sorted_List;


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
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
        ListNode head=createLinkedList(new int[]{1,1,1,2,2});
        solution.deleteDuplicates(head);
    }

    public static ListNode createLinkedList(int[] numbers) {
        ListNode listNode=null;
        ListNode temp=null;
        for (int number:numbers){
            if(temp==null){
                listNode=new ListNode(number);
                temp=listNode;
            }
            else{
                temp.next=new ListNode(number);
                temp=temp.next;
            }

        }
        return listNode;
    }
}