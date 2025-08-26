package Silver.p2941;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        String[] strList = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int count = 0;
        //inputStr 루프
        for(int i=0; i<inputStr.length(); i++){
            char firstChar = inputStr.charAt(i);
            //strList 매칭 루프
            boolean same=false;
            for(int j=0; j<strList.length; j++){
                //첫 문자 매칭
                int lenRemain = inputStr.length()-i;
                //길이 예외 처리
                if(lenRemain>=strList[j].length()){
                    same = true;
                    //일치하는지 루프
                    for(int k=0;k<strList[j].length();k++){
                        if(inputStr.charAt(i+k) != strList[j].charAt(k)){
                            same=false;
                            break;
                        }
                    }

                    if(same){
                        count+=1;
                        i += strList[j].length()-1;
                        break;
                    }
                    else {
                        continue;
                    }
                }

            }
            if(!same){
                count+=1;
            }

        }
        System.out.println(count);
    }
}
