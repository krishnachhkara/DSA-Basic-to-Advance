/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // first detect cycle
        // then start from head and slow pointer using another two pointer
        // and whereever these new pointer meets is the required node.

        ListNode slow = head,
            fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast ){
                break;// cycle detected.
            }
        }

        if(fast == null || fast.next == null){
            return null; // no cycle.
        }

        ListNode n1 = head,
            n2 = slow;// or fast since both are pointing the same node in cycle.

        while(n1 != n2){
            n1 = n1.next;
            n2 = n2.next;
        }

        return n1;    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna