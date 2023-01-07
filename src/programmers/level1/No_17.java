package programmers.level1;
import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/12910
// 나누어 떨어지는 숫자 배열
public class No_17 {
    public static void main(String[] args) {
        No_17 j = new No_17();
        System.out.println(Arrays.toString(j.solution(new int[] {5,9,7,10}, 5)));
    }
    public int[] solution(int[] arr, int divisor) {
        List <Integer> answer = new ArrayList<>();
        Arrays.sort(arr);
        for(int i : arr) if( i % divisor == 0) answer.add(i);
        if(answer.size()==0) answer.add(-1);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }// return Arrays.stream(arr).filter(i -> i % divisor == 0).toArray();
}
