package 일차원배열.p10810;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //예제 입력
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int recur = sc.nextInt();
        int[] arr = new int[length];
        //반복예제 입력
        for(int i=0;i<recur;i++){
            int n1 = sc.nextInt()-1;
            int n2 = sc.nextInt()-1;
            int number = sc.nextInt();
            //입력받은예제 배열 적용
            for(int j=n1;j<=n2;j++){
                arr[j] = number;
            }
        }
        sc.close();

        //배열 공백 포함 출력
        for(int i=0;i<length;i++){
            System.out.print(arr[i]);
            if(i!=length-1) {
                System.out.print(" ");
            }
        }

    }
}
