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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ArrayList<Integer>list = new ArrayList<>();
        while(temp!=null){
            if(temp.val!=val){
                list.add(temp.val);
            }
            temp=temp.next;
        }
        ListNode head1 = null;
        ListNode temp1 = null;
        temp=null;
        for(int i:list){
            ListNode newnode = new ListNode(i);
            if(head1==null){
                head1=newnode;
                temp1=newnode;
                temp=newnode;
            }
            else{
                temp1=newnode;
                temp.next=temp1;
                temp=temp1;
            }
            temp1.next=null;
        }
        return head1;
    }
}