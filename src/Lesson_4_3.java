public class Lesson_4_3 {

    public static void main(String[] args) {
        int[] A = {1, 2};
        int X = 2;
        Lesson_4_3 les = new Lesson_4_3();
        int[] result = les.solution(X, A);
        System.out.println(result);
    }

    public int[] solution(int N, int[] A) {
        int current_max = 0;
        int last_max_operation = 0;
        int[] counters = new int[N];
        for(int i: A) {
            if(i<=N) {
                if(counters[i-1] < last_max_operation) {
                    counters[i-1] = last_max_operation;
                }
                counters[i-1]++;
                if(current_max < counters[i-1]) {
                    current_max = counters[i-1];
                }
            }else if(i==N+1) {
                last_max_operation = current_max;

            }
        }
        for(int i = 0;i<N; i++) {
            if(counters[i] < last_max_operation) counters[i] = last_max_operation;
        }
        return counters;
    }
}
