package 심화1.Silver.p2941;

import java.util.Scanner;
public class Main3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] croatian = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};
        
        int count = 0;
        int i = 0;
        
        while(i < input.length()) {
            boolean found = false;
            
            for(String alpha : croatian) {
                if(input.startsWith(alpha, i)) {
                    i += alpha.length();
                    found = true;
                    break;
                }
            }
            
            if(!found) {
                i++;
            }
            count++;
        }
        
        System.out.println(count);
    }
}