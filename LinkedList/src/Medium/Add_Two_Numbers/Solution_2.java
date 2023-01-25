package Medium.Add_Two_Numbers;


 class Solution_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3= null;
        int carry=0;
        ListNode temp=null;
        if(l1==null) return l2;
        if(l2==null) return l1;
        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val+carry;
            carry=0;
            carry+=sum/10;
            sum%=10;
            if(l3==null){
                temp=new ListNode(sum);
                l3=temp;
            }
            else{
                temp.next=new ListNode(sum);
                temp=temp.next;
            }
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int sum=l1.val+carry;
            carry=0;
            carry+=sum/10;
            sum%=10;
            temp.next=new ListNode(sum);
            l1=l1.next;
            temp=temp.next;
        }
        while(l2!=null){
            int sum=l2.val+carry;
            carry=0;
            carry+=sum/10;
            sum%=10;
            temp.next=new ListNode(sum);
            l2=l2.next;
            temp=temp.next;
        }
        if(carry!=0)
            temp.next=new ListNode(carry);
        return l3;
    }
    public static void main(String[] args){
        Solution_2 solution_2=new Solution_2();
        ListNode l1=null;
        ListNode l2=null;
        //int[] list1 = {2,4,3};
       // int[] list2 = {5,6,4};
        int[] list1 = {9,9,9,9,9,9,9};
        int[] list2 = {9,9,9,9};
        l1 = getListNode(list1);
        l2 = getListNode(list2);

        solution_2.addTwoNumbers(l1,l2);
    }

     private static ListNode getListNode( int[] list1) {
         ListNode list=null;
         ListNode temp=null;
         for (int i: list1){
             if(list ==null){
                 temp =new ListNode(i);
                 list = temp;
                 continue;
             }
             else{
                 temp.next=new ListNode(i);
             }
             temp = temp.next;
         }
         return list;
     }
 }
