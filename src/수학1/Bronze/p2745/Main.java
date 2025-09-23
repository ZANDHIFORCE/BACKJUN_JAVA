package 수학1.Bronze.p2745;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //ZZZZ
        String inputStr = sc.next();
        //36
        int B = sc.nextInt();

        //table char to int
        Map<Character, Integer> table = new HashMap<>();
        for(int i=0; i<10; i++){
            table.put((char)(i+'0'),i);
        }
        for(int i=10; i<36;i++)
        {
            table.put((char)('A'+(i-10)),i);
        }

        int total = 0;
        int insu = 0;
        for(int i=inputStr.length()-1;i>=0;i--){
            char temp = inputStr.charAt(i);
            total += table.get(temp)*Math.pow(B,insu);
            insu++;
        }
        System.out.println(total);

        sc.close();
    }
}