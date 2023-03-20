class Start {
    public static void main(String ... data) {
        Item a = Machine.create(1, 3, 5, 7);
        Item b = Machine.create(2, 3, 5, 8);
       
        Item c1 = Machine.merge1(a, b);
        for(Item current1 = c1; current1 != null; current1 = current1.next) {
            System.out.println(current1.value);
        }
        
        Item c2 = Machine.merge2(a, b);
        for(Item current2 = c2; current2 != null; current2 = current2.next) {
            System.out.println(current2.value);
        }
    }
}

class Machine {
    
    static Item merge2(Item a, Item b){
        if(a == null && b == null) return null;
        if(a == null && b != null) return b;
        if(a != null && b == null) return a;
        
        if(a.value < b.value) {
            a.next = merge2(a.next, b);
            return a;
        } else {
            b.next = merge2(a, b.next);
            return b;
        }
    }
    
    static Item merge1(Item a, Item b){
        Item head = null;
        Item tail = null;
        while(true){
            char minimum = ' '; //min
            if(a == null && b == null) break;
            if(a == null && b != null) minimum = 'b' ;
            if(a != null && b == null) minimum = 'a' ;
            if(a != null && b != null) { 
                if(a.value < b.value) minimum = 'a';
                if(a.value >= b.value) minimum = 'b';
            }
            Item best = null;
            if (minimum == 'a') { best = a; a = a.next; }
            if (minimum == 'b') { best = b; b = b.next; }
            if(head == null){
                head = best; tail = head;
            } else {
                tail.next = best; tail = tail.next;
            }
        }
        return head;
    }

    static Item create(int ... a) {
        if(a.length == 0) return null;
        Item head = new Item();
        head.value = a[0];
        Item tail = head;
        for(int i = 1; i < a.length; i++){
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


