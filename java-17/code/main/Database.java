package main;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


class Database {
    static String src = "jdbc:mysql://" +
			"127.0.0.1/airservice?" +
			"user=richard&password=branson";
    
    static ArrayList listAllVehicles() {
        ArrayList<String> result = new ArrayList<String>();
        try {
            String sql = "select * from vehicle"; 
            var cn = DriverManager.getConnection(src);
            var ps = cn.prepareStatement(sql);
            var rs = ps.executeQuery();
            while(rs.next()) {
                String name = rs.getString("name");
                result.add(name);
            }
            rs.close();
            ps.close();
            cn.close();
            
        } catch(Exception e) {
            System.err.println(e);
        }
        return result;
    } 
    
    static boolean insertStaff(String name, char gender, double salary, String status){
        try {
            String sql = "insert into staff(name, gender, salary, status)" +
                    " values(?, ?, ?, ?)"                                   ;
            Connection cn;
            cn = DriverManager.getConnection(src);
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, "" + gender);
            ps.setDouble(3, salary);
            ps.setString(4, status);
            ps.execute();
            ps.close();
            cn.close();
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
    }
    
    static boolean updateStaffStatus(String status, String name){
        try {
            String sql = "update staff set status = ? where name = ?";
            //Connection cn;
            var cn = DriverManager.getConnection(src);
            var ps = cn.prepareStatement(sql);
            ps.setString(1, status);
            ps.setString(2, name);
            ps.execute();
            ps.close();
            cn.close();
            return true;
        } catch(Exception e) {
            System.err.println(e);
            return false;
        }
    }
    
    static boolean deleteStaffFromName(String name) {
        try {
            String sql = "delete from staff where name = ?";
            var cn = DriverManager.getConnection(src);
            var ps = cn.prepareStatement(sql);
            ps.setString(1, name);
            ps.execute();
            ps.close();
            cn.close();
            return true;
        } catch(Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    static boolean checkConnection() {
        try {
            Connection cn;
            cn = DriverManager.getConnection(src);
            cn.close();
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
    }
}