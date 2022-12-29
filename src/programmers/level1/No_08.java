package programmers.level1;
import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/12954
// x만큼 간격이 있는 n개의 숫자
public class No_08 {
    public static void main(String[] args) {
        No_08 j = new No_08();
        System.out.println(Arrays.toString(j.solution(2,5)));
    }
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=1; i<=n; i++) answer[i-1] = (long)x*i;
        return answer;
    }
}
