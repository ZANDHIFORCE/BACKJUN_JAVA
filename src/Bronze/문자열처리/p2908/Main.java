package 문자열처리.p2908;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] arr = line.split("\\s+");
        int num1 = Integer.parseInt(convert(arr[0]));
        int num2 = Integer.parseInt(convert(arr[1]));

        if(num1>num2){
            System.out.println(num1);
        }
        else{
            System.out.println(num2);
        }
        sc.close();
    }

    public static String convert(String str){

        char[] charArr = str.toCharArray();

        int left = 0;
        int right = str.length()-1;

        while(left<right){
            //swap left right
            char tempChar = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = tempChar;
            //증가 감소
            left++;
            right--;
        }
        return new String(charArr);
    }
}
