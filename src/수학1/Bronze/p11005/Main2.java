package 수학1.Bronze.p11005;

import java.util.Scanner;
import java.util.Stack;
public class Main2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int B = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        while(num!=0){
            int remainder = num%B;
            stack.push(remainder);
            num/=B;
        }

        while(stack.isEmpty()){
            int temp = stack.pop();
            if(temp>=10){
                System.out.print((char)(temp-10+'A'));
            }
            else{
                System.out.print(temp);
            }
        }
        System.out.println();
        sc.close();
    }
}
