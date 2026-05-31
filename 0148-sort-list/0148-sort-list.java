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
    public ListNode sortList(ListNode head) {
        int count=0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int[] arr = new int[count];
        temp=head;
        int i=0;
        while(temp!=null){
            arr[i]=temp.val;
            temp=temp.next;
            i++;
        }
        Arrays.sort(arr);
        ListNode head1=null;
        temp = null;
        ListNode temp1 = null;
        for(i=0;i<arr.length;i++){
            ListNode newnode = new ListNode(arr[i]);
            if(head1==null){
                head1=newnode;
                temp=newnode;
                temp1=newnode;
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