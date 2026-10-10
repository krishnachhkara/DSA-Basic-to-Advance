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
    // reverse code
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
    public int pairSum(ListNode head) {
        ListNode slow = head,
            fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode p2 = reverseLL(slow);
        ListNode p1 = head;

        int maxi = Integer.MIN_VALUE;
        
        while(p1 != null && p2 != null){
            int candidate = p1.val + p2.val;
            maxi = Math.max(maxi,candidate);
            p1 = p1.next;
            p2 = p2.next;
        }

        return maxi;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna