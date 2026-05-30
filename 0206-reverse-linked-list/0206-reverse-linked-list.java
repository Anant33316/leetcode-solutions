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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer>set= new ArrayList<>();
        while(temp!=null){
            set.add(temp.val);
            temp=temp.next;
        }
        Collections.reverse(set);
        ListNode head1 = null;
        ListNode temp1 = null;
        ListNode tail = null;
        for(int i:set){
            ListNode newnode = new ListNode(i);
            if(head1==null){
                head1=newnode;
                temp1=newnode;
                tail=newnode;
            }
            else{
                
                tail=newnode;
                temp1.next=tail;
                temp1=tail;
            }
            temp1.next=null;
        }
        return head1;
    }
}