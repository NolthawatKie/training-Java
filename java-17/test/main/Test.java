package main;

public class Test {

    public void testConnection() {
        boolean result = Database.checkConnection();
        assert result;
    }
    public void testInsertStaff(){
        boolean result = Database.insertStaff("CCC", 'F', 58000.0, "resigned");
        assert result;
    }
    public void testUpdateStaff(){
        boolean result = Database.updateStaffStatus("active", "CCC");
        assert result;
    }
    public void testDeleteStaffFromName(){
        boolean result = Database.deleteStaffFromName("CCC");
        assert result;
    }
}



