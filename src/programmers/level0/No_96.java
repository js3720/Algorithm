package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120923
//연속된 수의 합
public class No_96 {
    public static void main(String[] args) {
        No_96 j = new No_96();
        System.out.println(Arrays.toString(j.solution(5,5)));
    }
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = 0;
        while(true){
            for(int i=0; i<num; i++){
                answer[i]=i+start;
            }
            if(Arrays.stream(answer).sum()==total) break;
            else if(Arrays.stream(answer).sum()<total) start++;
            else start--;
        }
        return answer;
    }
}
