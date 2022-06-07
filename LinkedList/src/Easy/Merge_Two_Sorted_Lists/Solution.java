package Easy.Merge_Two_Sorted_Lists;



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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result= new ListNode(0);
        ListNode prev=result;
        if(list1==null) return list2;
        if(list2==null) return list1;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                prev.next=list1;
                list1=list1.next;
            }
            else{
                prev.next=list2;
                list2=list2.next;
            }
            prev=prev.next;
        }
        if(list1!=null){
            prev.next=list1;
        }
        if(list2!=null){
            prev.next=list2;
        }
        return result.next;

    }
    public static void main(String[] args){
        int[] number1={1,2,4};
        int[] number2={2,3,5};
        ListNode list1=createLinkedList(number1);
        ListNode list2=createLinkedList(number2);


        Solution solution = new Solution();
        ListNode updated=solution.mergeTwoLists(list1,list2);
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