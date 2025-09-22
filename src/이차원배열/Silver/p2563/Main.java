package 이차원배열.Silver.p2563;


import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean[][] matrix = new boolean[101][101];
        int numPage = sc.nextInt();
        //page to true
        for(int i=0;i<numPage;i++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            for(int n=N;n<N+10;n++){
                for(int m=M;m<M+10;m++){
                    matrix[n][m]=true;
                }
            }
        }
        //count true
        int count =0;
        for(int i=1;i<101;i++){
            for(int j=1; j<101;j++){
                if(matrix[i][j]==true)
                {
                    count +=1;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}