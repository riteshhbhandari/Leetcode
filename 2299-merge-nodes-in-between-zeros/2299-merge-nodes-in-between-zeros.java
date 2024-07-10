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

 //we are editing the same linkedlist rather that creating a new linked list 
 //this will save space - reduce space/time complexity
class Solution {
    public ListNode mergeNodes(ListNode head) {
        int sum=0;
        ListNode str=head;//store the original head
        ListNode flg=head;// to hold the previous value of the zero
        int j=0;
       for(ListNode i=head.next;i!=null;i=i.next){
            if(i.val==0){
                i.val=sum;
                sum=0;
                flg.next=i;
                flg=i;
            }
            else
                sum=sum+i.val;
        }
    return str.next;//str.next because we dont want to include the first zero}
    }
}
