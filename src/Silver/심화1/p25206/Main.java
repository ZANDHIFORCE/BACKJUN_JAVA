package Silver.심화1.p25206;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int recur = 20;
        int count = 0;
        float total= 0F;

        Map<String, Float> scoreMap = new HashMap<>();
        scoreMap.put("A+", 4.5F);
        scoreMap.put("A0", 4.0F);
        scoreMap.put("B+", 3.5F);
        scoreMap.put("B0", 3.0F);
        scoreMap.put("C+", 2.5F);
        scoreMap.put("C0", 2.0F);
        scoreMap.put("D+", 1.5F);
        scoreMap.put("D0", 1.0F);
        scoreMap.put("F", 0.0F);

        for(int i=0;i<recur;i++){
            //소프트웨어 설계
            String subjectName = sc.next();
            //3.0
            float point = sc.nextFloat();
            //A+
            String score = sc.next();

            if (!score.equals("P")) {
                total += scoreMap.get(score) * point;
                count += point;
            }

        }
        System.out.println( total/(float)count );
    }
}
