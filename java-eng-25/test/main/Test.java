package main;
public class Test {
    public void testRightTriangles001() {
        String result = Triangle.isTriangle(3,4,5);
        assert "Right Triangles".equals(result);
    }
    public void testRightTriangles002() {
        String result = Triangle.isTriangle(9,40,41);
        assert "Right Triangles".equals(result);
    }
    public void testRightTriangles003() {
        String result = Triangle.isTriangle(7,24,25);
        assert "Right Triangles".equals(result);
    }
    public void testAcuteTriangles001() {
        String result = Triangle.isTriangle(10,20,22);
        assert "Acute Triangles".equals(result);
    }
    public void testObtuseTriangles001() {
        String result = Triangle.isTriangle(13,12,19);
        assert "Obtuse Triangles".equals(result);
    }
    public void testNotTriangles001() {
        String result = Triangle.isTriangle(3,5,8);
        assert "Not a Triangle".equals(result);
    }
    public void testInvalidInput001() {
        String result = Triangle.isTriangle(3,4,-5);
        assert "Try with more than 0 Integer".equals(result);
    }
}