package 이차원배열.Bronze.p10798;

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=5;
        int M=15;
        char[][] matrix = new char[N][M];
        //matrix initailization *
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                matrix[i][j] = '*';
            }
        }
        //matrix input
        for(int i=0;i<5;i++){
            String line = sc.nextLine();
            for(int j=0;j<line.length();j++){
                matrix[i][j] = line.charAt(j);
            }
        }
        //matrix output
        for(int j=0;j<M;j++){
            for(int i=0;i<N;i++){
                if(matrix[i][j]!='*'){
                    System.out.print(matrix[i][j]);
                }
                else{
                    continue;
                }
            }
        }
    }
}