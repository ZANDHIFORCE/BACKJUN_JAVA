package p10813;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //N, M 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        //배열 생성 및 초기화
        int[] arr = new int[N];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }

        //반복 예제문 입력받고 수행
        for(int i =0; i<M; i++){
            int idx1 = sc.nextInt()-1;
            int idx2 = sc.nextInt()-1;

            //swap(arr[idx1], arr[idx2])
            int tempInt = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2] = tempInt;
        }

        //배열출력
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(" ");
            }
        }

    }
}
