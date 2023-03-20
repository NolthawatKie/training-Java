public class TestCashier {
    public void test001() {
        Cashier c = new Cashier();
        double total = c.getTotal(75);
        double delta = 0.0001;
        double start = 75.0 - delta;
        double finish = 75.0 + delta;
        assert total >= start && total <= finish; //
    }
    
    public void test002() {
        Cashier c = new Cashier();
        double total = c.getTotal(100);
        double delta = 0.0001;
        double start = 95.0 - delta;
        double finish = 95.0 + delta;
        assert total >= start && total <= finish; //
    }

    public void test003() {
        Cashier c = new Cashier();
        double total = c.getTotal(120);
        double delta = 0.0001;
        double start = 114.0 - delta;
        double finish = 114.0 + delta;
        assert total >= start && total <= finish; // to confirm
    }
     public void test004() {
        Cashier c = new Cashier();
        double total = c.getTotal(99.0);
        double delta = 0.0001;
        double start = 99.0 - delta;
        double finish = 99.0 + delta;
        assert total >= start && total <= finish; //
    }
    public void test005() {
        Cashier c = new Cashier();
        double total = c.getTotal(101.0);
        double delta = 0.0001;
        double start = 95.95 - delta;
        double finish = 95.95 + delta;
        assert total >= start && total <= finish; //
    }
}