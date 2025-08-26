package Bronze.문자열처리.p1152;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int count = 0;
        for(int i=0; i<line.length();i++){
            if(line.charAt(i) == ' '){
                count+=1;
            }
        }

        if(line.charAt(0)==' '){
            count--;
        }
        if(line.charAt(line.length()-1)==' '){
            count--;
        }
        System.out.println(count+1);
    }
}
