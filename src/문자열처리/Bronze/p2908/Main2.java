package 문자열처리.Bronze.p2908;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        int num1 = Integer.parseInt(new StringBuilder(a).reverse().toString());
        int num2 = Integer.parseInt(new StringBuilder(b).reverse().toString());
        
        System.out.println(Math.max(num1, num2));
        
        sc.close();
    }
}