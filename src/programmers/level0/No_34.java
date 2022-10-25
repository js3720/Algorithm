package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120833
//배열 자르기
public class No_34 {
    public static void main(String[] args) {
        No_34 j = new No_34();
        int[] numbers = {1,2,3,4,5};
        System.out.println(j.solution(numbers,1,3));
    }
    public int[] solution(int[] numbers, int num1, int num2) {
        List<Integer> List = new ArrayList<>();
        for(int i=num1; i<=num2; i++){
            List.add(numbers[i]);
        }
        int[] answer = List.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
