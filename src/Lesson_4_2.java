import java.util.HashSet;
import java.util.Set;

public class Lesson_4_2 {

    public static void main(String[] args) {
        int[] A = {1, 2};
        int X = 2;
        Lesson_4_2 les = new Lesson_4_2();
        int result = les.solution(X, A);
        System.out.println(result);
    }

    public int solution(int X, int[] A) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=1;i<=X;i++) {
            set.add(i);
        }
        for(int i = 0; i< A.length; i++) {
            set.remove(A[i]);
            if(set.isEmpty()) {
                return i;
            }
        }
        return -1;
    }
}
