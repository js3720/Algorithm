package programmers.level1;
import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/86051
// 없는 숫자 더하기
public class No_20 {
    public static void main(String[] args) {
        No_20 j  = new No_20();
        System.out.println(j.solution(new int[] {1,2,3,4,6,7,8,0}));
    }
    public int solution(int[] numbers){
        return 45-Arrays.stream(numbers).sum();
    }// return IntStream.range(0, 10).filter(i -> Arrays.stream(numbers).noneMatch(num -> i == num)).sum();
}
