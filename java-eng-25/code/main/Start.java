package main;
import java.io.File;
import java.util.Scanner;
class Start {
    public static void main(String[] args) {
        File file = new File("data.txt");
        try {
            Scanner input = new Scanner(file);
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            String result = Triangle.isTriangle(a, b, c);
            System.out.println(result);
        } catch(Exception e)  {
            System.err.print("Invalid input");
        }
    }
}

class Triangle {
    static String isTriangle(int a, int b, int c) {
        if( a <= 0 || b <= 0 || c <= 0) 
            return "Try with more than 0 Integer";
        if(a + b > c && b + c > a && c + a > b) {
            int max_num = 0; int num1 = 0; int num2 = 0;
            if (a >= b && a >= c) {
                max_num = a; num1 = c; num2=b;
            }
            if (b >= c && b >= a) {
                max_num = b; num1 = c; num2=a;
            }
            if (c >= a && c >= b) {
                max_num = c; num1 = b; num2=a;
            }
            if(num1*num1 + num2*num2 == max_num*max_num) 
                return "Right Triangles";
            if( num1*num1 + num2*num2 > max_num*max_num ) 
                return "Acute Triangles";
            return "Obtuse Triangles";
        }
        return "Not a Triangle";
    }
}

