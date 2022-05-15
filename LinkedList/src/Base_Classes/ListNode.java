package Base_Classes;
public class ListNode {
      public int val;
      public ListNode next;
      public ListNode() {}
      public ListNode(int val) { this.val = val; }
      public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

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