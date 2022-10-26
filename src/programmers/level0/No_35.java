package programmers.level0;
import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/120897
//약수 구하기
public class No_35 {
    public static void main(String[] args) {
        No_35 j = new No_35();
        System.out.println(j.solution(24));
    }
    public int[] solution(int n) {
        List<Integer> List= new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                List.add(i);
            }
        }
        int[] answer = List.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }// return Arrays.stream(numList).filter(value -> n%value == 0).toArray();
}
