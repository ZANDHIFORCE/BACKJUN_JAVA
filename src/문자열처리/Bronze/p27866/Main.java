package 문자열처리.Bronze.p27866;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int inputNum = sc.nextInt();
        System.out.println(inputString.charAt(inputNum-1));
    }
}
