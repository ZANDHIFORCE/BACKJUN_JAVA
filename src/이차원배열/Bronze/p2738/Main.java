package 이차원배열.Bronze.p2738;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] matA = new int[N][M];
        int[][] matB = new int[N][M];

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                matA[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                matB[i][j] = sc.nextInt();
                
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(matA[i][j]+matB[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
        
        sc.close();
    }
}