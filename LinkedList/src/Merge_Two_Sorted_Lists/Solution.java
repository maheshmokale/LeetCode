package Merge_Two_Sorted_Lists;


import Base_Classes.ListNode;

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
        ListNode list1=ListNode.createLinkedList(number1);
        ListNode list2=ListNode.createLinkedList(number2);


        Solution solution = new Solution();
        ListNode updated=solution.mergeTwoLists(list1,list2);
    }


}