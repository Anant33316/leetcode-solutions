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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return head.next;
        }
        ListNode temp =head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        temp=head.next;
        ListNode temp1=head;
        int count1=1;
        while(count1<count/2){
            temp1=temp1.next;
            temp=temp.next;
            count1++;
        }
        temp1.next = temp.next;
        return head;
    }
}