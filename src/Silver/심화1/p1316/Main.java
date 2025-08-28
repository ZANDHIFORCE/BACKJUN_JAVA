package Silver.심화1.p1316;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //백준 1316번 실버 심화 1
        //알파벳 배열 생성(abcdefghijklnmopqrstuvwxyz) 26개
        //숫자만큼 문자열 입력 루프
            //입력: 문자열
            //문자열 루프
            //1. 이전알파벳이랑 같으면 스킵
            //2. 알파벳 없으면 True로 바꾸기 있으면 결과 출력
            //결과: True, False
        //함수생성 [소문자 알파벳 -> index]
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        sc.nextLine();
        int count = 0;
        for(int i=0;i<inputNum;i++){
            String inputStr = sc.nextLine();
            if(checkGroup(inputStr)){
                count+=1;
            }
        }
        System.out.println(count);
        sc.close();
    }

    private static boolean checkGroup(String inputStr){
        boolean[] boolArr = new boolean[26];
        char[] charArr = inputStr.toCharArray();
        char pastC = charArr[0];
        boolArr[pastC - 'a'] = true;
        for(char c: charArr){
            if(pastC==c){
                continue;
            }

            if(boolArr[c-'a']==false){
                boolArr[c-'a']=true;
                pastC=c;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
