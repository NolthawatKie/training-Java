class Start {
    public static void main(String[] data){
        Cashier c = new Cashier();
        double n = c.getTotal(101);
        System.out.println(n);
    }
}
class Cashier {
    double getTotal(double price) {
        return price >= 100 ? price * 0.95 : price; 
    }
}

