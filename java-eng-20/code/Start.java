class Start {
    public static void main(String[] data) {
        int[] a = {3, 7 ,5 ,8, 4, 9, 1};
        Engine e = new Engine();
        Player root = e.build(a);
        System.out.println(e.best(root));
        int height = e.getHeight(root);
        //int height = 10;
        int[] sum = new int[height];
        e.sumByLevel(root, 0, sum);
        for (int i = 0; i < height; i++) {
            System.out.println(sum[i]);
        }
        e.maxPath(root, "");
      
    }
}

class Player {
    String name;
    int number;
    double salary;
    Player left;
    Player right;
}

class Engine {
    
    /*

             8          8
            / \
           /   \
          7     9      16
         / \   / \
        3   5 4   1    13

LINE Thailand:
873
875
894 ---> Maximum Path
891
*/
    
    Player build(int[] a) {
        return build(a, 0, a.length - 1);
    }
    
    Player build(int[] a, int start, int finish) {
        if(start > finish) return null;
        int mid = (start + finish) / 2;
        Player center = new Player();
        center.number = a[mid];
        center.left = build(a, start, mid - 1);
        center.right = build(a, mid + 1, finish);
        return center;
    }
    
    int best(Player p) {        
        if(p == null) return Integer.MIN_VALUE;
        int a = best(p.left);
        int b = best(p.right);
        int c = p.number;
        if(a > b && a > c) return a;
        if(b > c && b > a) return b;
        return c;

    }
    
    void maxPath(Player p, String path) {
        if(p == null) return ;
        if(p.left == null && p.right == null) {
            System.out.println(path + p.number);
            return ;
        }
        maxPath(p.left, path + p.number);
        maxPath(p.right, path + p.number);
    }
    
    void sumByLevel(Player p, int level, int[] sum) {
        if(p == null) return;
        sum[level] = sum[level] + p.number;
        sumByLevel(p.left, level + 1, sum);
        sumByLevel(p.right, level + 1, sum);
    }
    
    int getHeight(Player p) {
        if(p == null) return 0;
        int a = getHeight(p.left);
        int b = getHeight(p.right);
        return a > b ? a + 1 : b + 1;
    }
    
}