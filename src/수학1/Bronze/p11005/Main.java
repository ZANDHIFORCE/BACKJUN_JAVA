package 수학1.Bronze.p11005;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int B = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        while(num!=0){
            int remainder = num%B;
            list.add(remainder);
            num/=B;
        }

        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)>=10){
                System.out.print((char)(list.get(i)-10+'A'));
            }
            else{
                System.out.print(list.get(i));
            }
        }
        System.out.println();
        sc.close();
    }
}