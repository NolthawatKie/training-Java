class Start {
    public static void main(String ... data) {
        Item head = Machine.build(4, 8, 2, 9, 6, 1);
//        Item head = Machine.build(4, 3, 5);
//        Item second = Machine.divide(head);
//        Machine.print(head);
//        System.out.println("---");
//        Machine.print(second);
//        System.out.println("---");
        head = Machine.sort(head);
        Machine.print(head); 
    }
}

class Machine {
    
    static Item sort(Item head) {
        if( head == null) return null;
        if(head.next == null) return head;
        Item second = divide(head);
        head = sort(head);
        second = sort(second);
        return merge(head, second);
    }
    
    static Item merge(Item a, Item b) {
        if(a == null && b == null) return null;
        if(a == null && b != null) return b;
        if(a != null && b == null) return a;
        if(a.value < b.value) {
            Item heart = a ;
            heart.next = merge(a.next, b);
            return heart;
        } else {
            Item heart = b;
            heart.next = merge(a, b.next);
            return heart;
        }
    }
    
    static Item divide(Item head) {
        if(head == null) return null;       //  no data
        if(head.next == null) return null;  // just only 1 item
//        if(head.next.next == null){
//            Item second = head.next;
//            head.next = null;
//            return second;
//        }
        Item fast = head, slow = head;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next; // fast = fast + 2
            slow = slow.next; // slow = slow + 1
        }
        Item second = slow.next;    // keep address
        slow.next = null;         //cut
        return second;
        
    }

    static void print(Item head) {
        for (Item c = head; c != null; c = c.next) {
            System.out.println(c.value);
        }
    }

    static Item build(int ... a) {
        if (a.length == 0) return null;
        Item head = new Item();
        head.value = a[0];
        Item tail = head;
        for (int i = 1; i < a.length; i++){
            Item newly = new Item();
            newly.value = a[i];
            tail.next = newly;
            tail = tail.next;
        }
        return head;
    }
}

class Item {
    int value;
    Item next;
}