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
    public ListNode deleteDuplicates(ListNode head) {
        LinkedHashSet<Integer>set = new LinkedHashSet<>();
        ListNode temp = head;
        while(temp!=null){
            set.add(temp.val);
            temp=temp.next;
        }
        ListNode head1 = null;
        ListNode tail1 = null;
        ListNode temp1 = null;
        for(int i:set){
            ListNode newnode = new ListNode(i);
            if(head1==null){
                head1= newnode;
                tail1=newnode;
                temp1=newnode;
            }
            else{
                tail1=newnode;
                temp1.next=tail1;
                temp1=tail1;
            }
            tail1.next=null;
        }
        return head1;
    }
}