public class Lesson_5_1 {
    public static void main(String[] args) {
        int[] A = {0,1, 0, 1, 1};
        int X = 2;
        Lesson_5_1 les = new Lesson_5_1();
        int result = les.solution( A);
        System.out.println(result);
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        int len = A.length;
        int totalSum = 0;
        for(int i: A) {
            totalSum += i;
        }
        int preSum = 0;
        int result = 0;
        for(int i=0;i<len;i++) {
            preSum += A[i];
            if(A[i]==0) {
                result += totalSum - preSum;
                if(result > 1000000000) {
                    result = -1;
                    break;
                }
            }
        }
        return result;
    }
}
