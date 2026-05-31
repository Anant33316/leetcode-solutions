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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ArrayList<Integer>list = new ArrayList<>();
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        Collections.reverse(list);
        int count=1;
        while(count<n){
            count++;
        }
        list.remove(--count);
        Collections.reverse(list);
        ListNode head1 = null;
        temp = null;
        ListNode temp1 = null;
        for(int i:list){
            ListNode newnode = new ListNode(i);
            if(head1==null){
                head1=newnode;
                temp1=newnode;
                temp=newnode;
            }
            else{
                temp=newnode;
                temp1.next=temp;
                temp1=temp;
            }
            temp.next=null;
        }
        return head1;
    }
}