package 이차원배열.Bronze.p2566;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=9;
        int M=9;
        int maxNum = -1;
        int maxI=-1;
        int maxJ=-1;
        for(int i=0; i<N;i++){
            for(int j=0; j<M;j++){
                int num = sc.nextInt();
                if(maxNum<num){
                    maxNum = num;
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println(maxNum);
        System.out.println(String.valueOf(maxI+1)+" "+String.valueOf(maxJ+1));

        sc.close();

    }
}
