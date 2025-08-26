package Bronze.심화1.p5622;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Map<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('A',3);
        hashMap.put('B',3);
        hashMap.put('C',3);

        hashMap.put('D',4);
        hashMap.put('E',4);
        hashMap.put('F',4);

        hashMap.put('G',5);
        hashMap.put('H',5);
        hashMap.put('I',5);

        hashMap.put('J',6);
        hashMap.put('K',6);
        hashMap.put('L',6);

        hashMap.put('M',7);
        hashMap.put('N',7);
        hashMap.put('O',7);

        hashMap.put('P',8);
        hashMap.put('Q',8);
        hashMap.put('R',8);
        hashMap.put('S',8);

        hashMap.put('T',9);
        hashMap.put('U',9);
        hashMap.put('V',9);

        hashMap.put('W',10);
        hashMap.put('X',10);
        hashMap.put('Y',10);
        hashMap.put('Z',10);

        Scanner sc = new Scanner(System.in);
        String strInput = sc.nextLine();
        char[] charInput = strInput.toCharArray();
        int total = 0;
        for (char c : charInput) {
            total += hashMap.get(c);
        }
        System.out.println(total);

    }
}
