public class lesson_3_2 {
    public static void main(String[] args) {
        int[] A = {2, 3, 1, 5};
//        int standardTotal = A.length+1;
//        int arrayTotal = 0;
        int result = A.length+1;
        for(int i=0;i<A.length;i++) {
//            standardTotal += i + 1;
//            arrayTotal += A[i];
            result += i + 1 - A[i];
        }
//         result = standardTotal - arrayTotal;
        System.out.println(result);
    }
}
