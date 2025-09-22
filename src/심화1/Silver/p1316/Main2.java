package 심화1.Silver.p1316;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        sc.nextLine();
        int count = 0;
        
        for(int i = 0; i < inputNum; i++){
            String inputStr = sc.nextLine();
            if(checkGroup(inputStr)){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }

    private static boolean checkGroup(String inputStr){
        if(inputStr.isEmpty()) return true;
        
        boolean[] visited = new boolean[26];
        char prev = inputStr.charAt(0);
        visited[prev - 'a'] = true;
        
        for(int i = 1; i < inputStr.length(); i++){
            char current = inputStr.charAt(i);
            if(prev == current) continue;
            
            if(visited[current - 'a']) return false;
            
            visited[current - 'a'] = true;
            prev = current;
        }
        return true;
    }
}