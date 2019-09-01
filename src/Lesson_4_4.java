public class Lesson_4_4 {
    public static void main(String[] args) {

    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        int len = A.length;
        int[] result = new int[len+1];
        for(int i: A) {
            if(i<1 || i> len) continue;
            result[i]++;
        }
        for(int i=1;i<len+1;i++) {
            if(result[i]<=0) return i;
        }
        return len+1;
    }
}
