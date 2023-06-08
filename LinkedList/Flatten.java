public static Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = sortList(head);
        Node right = sortList(nextOfMiddle);

        Node sortedList = merge(left, right);
        return sortedList;
    }

    private static Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private static Node merge(Node left, Node right) {
        Node result = null;

        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        if (left.val <= right.val) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }

        return result;
    }
    Node flatten(Node root)
    {
        Node t1 = root;
        while(t1!=null){
            Node t2 = t1.bottom;
            while(t2.next != null){
                t2 = t2.next;
            }
            t1=t1.next;
        }
    }
