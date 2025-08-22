import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //a,b,c,d,e,f,g,h,i,j,k,l,n,m,o,p,q,r,s,p,u,v,w,x,y,z
        int numArr[] = new int[26];
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0 ; i<str.length(); i++)
        {
            numArr[alphaToIndex(str.charAt(i))]++;
        }

        int max = 0;
        int index = 0;
        for(int i=0; i<numArr.length; i++)
        {
            if(max<numArr[i]){
                max = numArr[i];
                index = i;
            }
        }

        for (int i=0;i<numArr.length;i++){
            if(max==numArr[i] && i!=index){
                System.out.println("?");
                return;
            }
        }

        System.out.println((char)(index+'A'));
    }

    private static int alphaToIndex(char alphabet){
        if('a'<=alphabet && alphabet<='z'){
            return (int)alphabet - (int)'a';
        }
        else{
            return (int)alphabet - (int)'A';
        }
    }
    
}
