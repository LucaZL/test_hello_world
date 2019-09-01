//        Integers K, M and a non-empty array A consisting of N integers, not bigger than M, are given.
//
//        The leader of the array is a value that occurs in more than half of the elements of the array, and the segment of the array is a sequence of consecutive elements of the array.
//
//        You can modify A by choosing exactly one segment of length K and increasing by 1 every element within that segment.
//
//        The goal is to find all of the numbers that may become a leader after performing exactly one array modification as described above.
//
//        Write a function:
//
//class Solution { public int[] solution(int K, int M, int[] A); }
//
//that, given integers K and M and an array A consisting of N integers, returns an array of all numbers that can become a leader, after increasing by 1 every element of exactly one segment of A of length K. The returned array should be sorted in ascending order, and if there is no number that can become a leader, you should return an empty array. Moreover, if there are multiple ways of choosing a segment to turn some number into a leader, then this particular number should appear in an output array only once.
//
//        For example, given integers K = 3, M = 5 and the following array A:
//
//        A[0] = 2
//        A[1] = 1
//        A[2] = 3
//        A[3] = 1
//        A[4] = 2
//        A[5] = 2
//        A[6] = 3
//        the function should return [2, 3]. If we choose segment A[1], A[2], A[3] then we get the following array A:
//
//        A[0] = 2
//        A[1] = 2
//        A[2] = 4
//        A[3] = 2
//        A[4] = 2
//        A[5] = 2
//        A[6] = 3
//        and 2 is the leader of this array. If we choose A[3], A[4], A[5] then A will appear as follows:
//
//        A[0] = 2
//        A[1] = 1
//        A[2] = 3
//        A[3] = 2
//        A[4] = 3
//        A[5] = 3
//        A[6] = 3
//        and 3 will be the leader.
//
//        And, for example, given integers K = 4, M = 2 and the following array:
//
//        A[0] = 1
//        A[1] = 2
//        A[2] = 2
//        A[3] = 1
//        A[4] = 2
//        the function should return [2, 3], because choosing a segment A[0], A[1], A[2], A[3] and A[1], A[2], A[3], A[4] turns 2 and 3 into the leaders, respectively.
//
//        Write an efficient algorithm for the following assumptions:
//
//        N and M are integers within the range [1..100,000];
//        K is an integer within the range [1..N];
//        each element of array A is an integer within the range [1..M].
//        Copyright 2009–2019 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Challenge_ {

    public static void main(String[] args) {
//        int K = 3;
//        int M = 5;
//        int[] A = {2, 1, 3, 1, 2, 2, 3};
        int K = 4;
        int M = 2;
        int[] A = {1, 2, 2, 1, 2};
        Challenge_ ch = new Challenge_();
        ch.solution(K, M, A);
    }

    public int[] solution(int K, int M, int[] A) {
        // write your code in Java SE 8
        Set<Integer> result = new TreeSet<>();
        int half_len = A.length / 2;
        int[] standardGroup = new int[M+2];
        for(int i: A) {
            standardGroup[i]++;
        };
        int[] changedGroup = standardGroup.clone();
        for(int i=0;i<K;i++) {
            int index = A[i];
            changedGroup[index]--;
            changedGroup[index+1]++;
        }
        for(int i=0;i<changedGroup.length; i++) {
            if(changedGroup[i]>half_len) {
                result.add(i);
            }
        }
        for(int i=K;i<A.length;i++) {
            int pre_index = A[i-K];
            int last_index = A[i];
            changedGroup[pre_index]++;
            changedGroup[pre_index+1]--;
            changedGroup[last_index]--;
            changedGroup[last_index+1]++;
            if(changedGroup[pre_index] > half_len) {
                result.add(pre_index);
            }
            if(changedGroup[last_index+1] > half_len) {
                result.add(last_index+1);
            }
        }
        Integer[] s = result.toArray(new Integer[result.size()]);
        int[] ss = new int[result.size()];
        for(int i=0;i<ss.length;i++) {
            ss[i] = s[i];
//            System.out.println(ss[i]);
        }
        return ss;
    }
}
