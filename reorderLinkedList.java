// Leetcode 234 : reorder the linked list
// All important functions of linkedlist is used in this problem 


import java.util.*;

public class reorderLinkedList {
   
 
  public class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return; // No need to reorder if the list is empty or has only one node

        ListNode midd = middle(head);  // found middle
        ListNode secondHead = reverse(midd.next);  // head of reversed part
        midd.next = null; // break the original list into two parts
        ListNode firstHead = head;

        while (firstHead != null && secondHead != null) {
            ListNode temp = firstHead.next;
            firstHead.next = secondHead;
            firstHead = temp;

            temp = secondHead.next;
            secondHead.next = firstHead;
            secondHead = temp;
        }
    }

    private ListNode middle(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextt;
        }
        return prev;
    }
}

}
