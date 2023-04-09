package Easy.Merge_Two_Sorted_Lists;

class ListNode2 {
      int val;
      ListNode2 next;
      ListNode2() {}
      ListNode2(int val) { this.val = val; }
      ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
}
public class Solution2 {
    public static ListNode2 mergeTwoLists(ListNode2 list1, ListNode2 list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode2 mergedList=null;
        ListNode2 temp=null;
        while (list1 != null || list2 != null) {
            int val;
            if(list1==null || list2==null){
                if(list2==null){
                    val=list1.val;
                    list1=list1.next;
                }
                else{
                    val=list2.val;
                    list2=list2.next;
                }
                temp.next=new ListNode2(val);
                temp=temp.next;
                continue;
            }

            if(list1.val<=list2.val){
                val=list1.val;
                list1=list1.next;
            }
            else{
                val=list2.val;
                list2=list2.next;
            }

            if(temp==null) {
                temp = new ListNode2(val);
                mergedList = temp;
            }
            else{
                temp.next=new ListNode2(val);
                temp=temp.next;
            }

        }
        return mergedList;
    }
    public static void main(String[] args){
        int[] num1={2};
        int[] num2={1};
        ListNode2 list1=createNewList(num1);
        ListNode2 list2=createNewList(num2);

        mergeTwoLists(list1,list2);
    }

    private static ListNode2 createNewList(int[] num) {
        ListNode2 list=null;
        ListNode2 temp=null;
        if(num.length>0){
            int i=0;
            while(i<num.length){
                if(list==null){
                    temp=new ListNode2(num[i]);
                    list=temp;
                }
                else{
                    temp.next=new ListNode2(num[i]);
                    temp=temp.next;
                }
                i++;
            }
        }
        return list;
    }
}
