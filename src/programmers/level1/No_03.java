package programmers.level1;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/12944
//평균 구하기
public class No_03 {
    public static void main(String[] args) {
        No_03 j = new No_03();
        System.out.println(j.solution(new int[] {1,2,3,4}));
    }
    public Double solution(int[] arr) {
        return (double)Arrays.stream(arr).average().orElse(0);
    }
}
