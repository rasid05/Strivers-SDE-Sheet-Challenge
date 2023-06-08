public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0)
            return head;
        int size = 1;
        ListNode lastPtr = head, midPtr = head;
        while(lastPtr.next != null){
            size++;
            lastPtr = lastPtr.next;
        }
        lastPtr.next = head;
        k = size - (k % size);
        while(--k > 0)
            midPtr = midPtr.next;
        head = midPtr.next;
        midPtr.next = null;

        return head;
    }
