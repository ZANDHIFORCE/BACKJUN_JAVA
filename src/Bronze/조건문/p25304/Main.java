package 조건문.p25304;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int recur = sc.nextInt();
        int totalPrice = 0;
        for(int i =0; i<recur; i++){
            int value = sc.nextInt();
            int quantity = sc.nextInt();
            totalPrice += value*quantity;
        }
        sc.close();
        if(x == totalPrice){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
