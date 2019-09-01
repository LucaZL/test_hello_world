import java.util.Arrays;

public class lesson_3_3 {
    public static void main(String[] args) {
        int[] A = {-3,-1};
        int total = Arrays.stream(A).sum();
        int result = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < A.length - 1; i++) {
            sum += A[i];
            int x = Math.abs(sum - (total - sum));
            if(result > x) {
                result = x;
            }
        }
        System.out.println(total);
        System.out.println(result);
    }
}
