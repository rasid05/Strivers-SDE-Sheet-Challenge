public ListNode middleNode(ListNode head) {
        // if(head.next == null)
        //     return head;
        // ListNode temp = head;
        // int count = 0;
        // while(temp != null){
        //     count++;
        //     temp = temp.next;
        // }

        // count = (count/2);
        // temp = head;
        // while(count>0){
        //     temp = temp.next;
        //     count--;
        // }
        // return temp;
        
  
        // Solution 2 : Using Tortoise Method
        ListNode slow = head, fast=head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
