package 일차원배열.Bronze.p5597;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //30짜리 배열 boolean 배열
        boolean[] arr = new boolean[30];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<28; i++){
            //입력은 다 -1해서 받기
            int num = sc.nextInt()-1;
            arr[num] = true;
        }

        //출력은 +1 해서 출력
        for(int i = 0; i<30; i++){
            if(arr[i]==false){
                System.out.println(i+1);
            }
        }

    }
}
