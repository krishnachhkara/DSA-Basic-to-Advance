/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // reverse a linked list code 
    public ListNode reverseLL(ListNode curr){
        ListNode prev = null;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        } 
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head,
            fast = head;

        // first reach the middle of ll
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        } 

        // pointing the start of reverse LL;
        ListNode p2 = reverseLL(slow);

        ListNode p1 = head;
        // now comparaing values
        while(p1 != null && p2 != null){
            if(p1.val != p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna