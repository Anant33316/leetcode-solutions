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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int tar = 1;
        temp = head;
        while(tar<=count/2){
            temp=temp.next;
            tar++;
        }
        ListNode head1 = null;
        ListNode temp1=null;
        ListNode tail = null;
        while(temp!=null){
            ListNode newnode = new ListNode(temp.val);
            if(head1==null){
                head1=newnode;
                temp1=newnode;
                tail = newnode;
            }
            else{
                tail=newnode;
                temp1.next=tail;
                temp1=tail;
            }
            temp=temp.next;
        }
        return head1;
    }
}