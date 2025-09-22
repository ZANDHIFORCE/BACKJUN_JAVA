package 문자열처리.Bronze.p9086;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<inputNum; i++){
            String inputStr = sc.nextLine();
            System.out.print(inputStr.charAt(0));
            System.out.println(inputStr.charAt(inputStr.length()-1));
        }
    }
}
