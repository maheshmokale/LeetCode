package Palindrome_Linked_List;


//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        int mid = 0;
        int num = 0;
        ListNode reverseList = null;
        while (fast.next !=null && fast.next.next != null) {
            fast = fast.next.next;
            mid++;
        }
        while (slow != null) {
            if (num == mid) {
                reverseList = slow.next;
                slow.next = null;
                break;
            }
            slow = slow.next;
            num++;

        }
        ListNode prev = null, next = null, curr = reverseList;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        while (prev != null && head != null){
            if (prev.val != head.val) return false;
            prev=prev.next;
            head=head.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = createLinkedList(new int[]{1, 0,0});
        solution.isPalindrome(head);
    }

    public static ListNode createLinkedList(int[] list) {
        ListNode temp = null;
        ListNode result = null;

        for (int val : list) {
            if (temp == null) {
                temp = new ListNode(val);
                result = temp;
                continue;
            } else
                temp.next = new ListNode(val);
            temp = temp.next;

        }
        return result;
    }
}