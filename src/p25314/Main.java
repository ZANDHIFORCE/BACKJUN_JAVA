package p25314;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if(num1!=0){
            num1-=1;
        }
        int dataSize = num1/4 + 1;
        for(int i=0; i<dataSize; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
