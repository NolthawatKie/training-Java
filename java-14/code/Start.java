import java.util.Arrays;
class Start {
    public static void main(String[] data) {
        Player[] team = {
            new Player("B", 7, 45000),
            new Player("O", 10, 40000),
            new Player("L", 8, 35000),
            new Player("J", 1, 38000),
        };
        // Array.sort() Error
        Arrays.sort(team, new MyComparator());
        for (Player p : team) {
            System.out.println(p.name + " " + p.salary);
        }
    }
}

class MyComparator implements java.util.Comparator {
    public int compare(Object x, Object y) {
        Player p = (Player)x;
        Player q = (Player)y;
        if(p.salary > q.salary) return +1;
        if(p.salary < q.salary) return -1;
        return 0;
    }
}

class Player { 
    Player(String s, int n, double v) {
        name = s;
        number = n;
        salary = v;
    }
    String name;
    int number;
    double salary;
}

