/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public int lengthOfLoop(Node head) {
        // first detect cycle
        // then start from head and slow pointer using another two pointer
        // and whereever these new pointer meets is the required node.

        Node slow = head,
                fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast ){
                break;// cycle detected.
            }
        }

        if(fast == null || fast.next == null){
            return 0; // no cycle.
        }

        Node n1 = head,
                n2 = slow;// or fast since both are pointing the same node in cycle.

        while(n1 != n2){
            n1 = n1.next;
            n2 = n2.next;
        }

        int len = 1;
        
        Node curr = n1.next;
        
        while(curr != n1){
            len++;
            curr = curr.next;
        }
        
        return len;
        
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna