import java.util.Arrays;

public class Lesson_5_2 {

    public static void main(String[] args) {
        String S = "1234321241231231";
        int[] P = {2,5,1,3,2,4};
        int[] Q = {3,6,1,5,2,8};
        int X = 2;
        Lesson_5_2 les = new Lesson_5_2();
        int[] result = les.solution(S, P, Q);
        for(int i: result) {
            System.out.println(i);
        }
    }

    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        S = S.replaceAll("A", "1").replaceAll("C","2").replaceAll("G","3").replaceAll("T","4");
        int M = P.length;
        int[] result = new int[M];
        for(int i=0;i<M;i++) {
            int pi = P[i];
            int qi = Q[i];
            int min = 5;
            for(int j=pi; j<=qi; j++) {
                int c = Character.getNumericValue(S.charAt(j));
                if(min > c) {
                    min = c;
                }
            }
            result[i] = min;
        }
        return result;
    }
}
