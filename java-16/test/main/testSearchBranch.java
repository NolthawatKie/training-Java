package main;

public class testSearchBranch {
    public void test001() {
        Sample s = new Sample();
        boolean result = s.searchBranch("London");
        assert result == true;
    }
    public void testNotFound() {
        Sample s = new Sample();
        boolean result = s.searchBranch("Bangkok");
        assert result == false;
    }
    
    void hello(){
        
    }
}
