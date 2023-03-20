package main;

public class testCashier {
    double delta = 0.000001;
    public void testBasic() {
        Sample s = new Sample();
        Result r = s.getTotal("150");
        double correct = 162;
        double start = correct - delta;
        double finish = correct + delta;
        assert r.total >= start && r.total <= finish;
    }
}
