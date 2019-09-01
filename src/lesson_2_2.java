import java.util.Arrays;

public class lesson_2_2 {
    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
        int index;
        int[] B = new int[A.length];
        for(int i = 0; i < A.length; i++) {
            index = (i + K) % A.length;
            B[index] = A[i];
        }
        Arrays.stream(B).forEach(i -> System.out.println(i));
    }
}
