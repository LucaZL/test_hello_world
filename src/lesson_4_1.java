import java.util.HashSet;
import java.util.Set;

public class lesson_4_1 {
    public static void main(String[] args) {
        int[] A = {100000, 100000, 100000, 100000, 100000, 100000, 100000};
        lesson_4_1 les = new lesson_4_1();
        int result = les.solution(A);
        System.out.println(result);
    }

    public int solution(int[] A) {
        int len = A.length;
        Set<Integer> set = new HashSet<Integer>();
        for(int i=1; i<= len; i++) {
            set.add(i);
        }
        for(int i: A) {
            set.remove(i);
        }
        if(set.isEmpty()) return 1;
        else return 0;
    }

//    public int solution(int[] A) {
//        // write your code in Java SE 8
//        int diff = 0;
//        for(int i=0;i<A.length;i++) {
//            diff += i+1 - A[i];
//        }
//        if(diff==0) return 1;
//        else return 0;
//    }
}
