package 일차원배열.Bronze.p10811;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //예제 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        //배열 생성 및 초기화
        int[] arr = new int[N];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        //반복예제 M 입력 -1해서 인덱스로 받기
        for(int i=0; i<M; i++){
            int idx1 = sc.nextInt()-1;
            int idx2 = sc.nextInt()-1;
            //역순으로 변경하는 함수
            modifyArr(idx1, idx2, arr);
        }
        sc.close();
        //출력
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(" ");
            }
        }
    }

    //while로 구현하면 훨신 쉬움
    public static void modifyArr(int n1, int n2, int[] arr){
        int n3 = (n2 - n1 + 1 ) / 2;
        for(int i=0; i<n3; i++){
            int target1 = n1+i;
            int target2 = n2-i;

            int temp_value = arr[target1];
            arr[target1] = arr[target2];
            arr[target2] = temp_value;
        }
    }
}
