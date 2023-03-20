import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Start {
    public static void main(String[] data) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter messege : " );
        String str = input.nextLine();
        char[] w = str.toCharArray();
        int[] a = new int[26];
        for(char c : w) {
            int position = c - 'A';
            if(position >= 0 && position < 26){
                a[position]++; // unicode practice case
            }
        }
        for(int i = 0; i < a.length; i++){
            char symbol = (char)('A' + i);
            System.out.println(symbol + ": " + a[i]);
        }         
    }
}


