public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null)
            return null;
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        count = count-n-1;
        if(count < 0)
            return head = head.next;
        temp = head;
        while(count>0){
            temp = temp.next;
            count--;
        }
        temp.next = temp.next.next;
        return head;
    }
