package 문자열처리.Bronze.p1152;

import java.util.Scanner;

public class Main2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        
        if(line.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(line.split("\\s+").length);
        }
        
        sc.close();
    }
}