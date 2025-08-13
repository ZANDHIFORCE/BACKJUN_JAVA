package Bronze.p10807;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] arr = new int[length];
        for(int i =0; i<length; i++){
            int tempInt = sc.nextInt();
            arr[i] = tempInt;
        }
        int v = sc.nextInt();
        sc.close();

        int count = 0;
        for(int i=0;i<length;i++){
            if(arr[i]==v){
                count += 1;
            }
        }
        System.out.println(count);

    }
}
