package 심화1.Silver.p2941;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        for(String alpha : croatian) {
            input = input.replace(alpha, "*");
        }
        
        System.out.println(input.length());
    }
}