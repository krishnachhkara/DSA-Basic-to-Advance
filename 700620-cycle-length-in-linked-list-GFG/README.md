# [Cycle Length in Linked List](https://www.geeksforgeeks.org/problems/find-length-of-loop/1)
## Medium
Given the head of a linked list. A linked list contains a cycle if its last node is connected to a previous node. If the given list contains a cycle, return the length of the cycle. Otherwise, return 0.
Note: Internally, the driver code uses an integer x to represent the position (1-based indexing) of the node to which the last node is connected. If x = 0, it means last node points to null which indicating there is no loop.
Examples:
Input: 
Output: 4
Explanation: There exists a loop in the linked list 2 -&gt; 3 -&gt; 4 -&gt; 5, the length of the loop is 4.
Input:
Output: 3
Explanation: There exists a loop in the linked list 19 -&gt; 33 -&gt; 10, the length of loop is 3.
Input:Output: 0
Explanation: There is no loop.