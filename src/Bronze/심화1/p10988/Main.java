package Bronze.심화1.p10988;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        int first = 0;
        int last = arr.length-1;
        boolean answer = true;
        while(first<last){
            if(arr[first]!=arr[last]){
                answer=false;
                break;
            }
            first++;
            last--;
        }
        System.out.println(answer ? 1 : 0);
    }
}