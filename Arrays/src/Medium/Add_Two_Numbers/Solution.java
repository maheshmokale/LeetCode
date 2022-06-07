package Medium.Add_Two_Numbers;


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=null;
        ListNode temp=null;
        int carry=0;
        if(l1==null) return l2;
        if(l2==null) return l1;
        while(l1!=null || l2!=null) {
            int sum = carry;
            carry = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            if (sum / 10 > 0) {
                carry = 1;
                sum %= 10;
            }
            if (temp == null){
                temp=new ListNode(sum);
                result=temp;
                continue;
            }
            temp.next=new ListNode(sum);
            temp = temp.next;
        }
        if(carry>0) temp.next=new ListNode(carry);
        return result;

    }
    public static void main(String[] args){
        Solution solution=new Solution();
        int[] l1Arr={1,2,3};
        int[] l2Arr={8,9,9};
        ListNode l1= solution.createListNode(l1Arr);
        ListNode l2= solution.createListNode(l2Arr);

        ListNode result=solution.addTwoNumbers(l1,l2);
    }
    public ListNode createListNode(int[] inputArr) {
        ListNode result=null;
        ListNode temp=null;

        for(int num:inputArr){
            if(result==null){
                result=new ListNode(num);
                temp=result;
                continue;
            }
            temp.next=new ListNode(num);
            temp=temp.next;
        }
        return result;
    }
}