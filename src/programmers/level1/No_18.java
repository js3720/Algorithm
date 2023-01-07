package programmers.level1;
import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/12935
// 제일 작은 수 제거하기
public class No_18 {
    public static void main(String[] args) {
        No_18 j = new No_18();
        System.out.println(Arrays.toString(j.solution(new int[] {4,3,2,1})));
    }
    public int[] solution(int[] arr) {
        if (arr.length==1) return new int[] {-1};
        int min = Arrays.stream(arr).min().getAsInt();
        List <Integer> answer = new ArrayList<>();
        for(int i : arr) if(i!=min) answer.add(i);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
