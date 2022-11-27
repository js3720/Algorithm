package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120884
//치킨 쿠폰
public class No_90 {
    public static void main(String[] args) {
        No_90 j = new No_90();
        System.out.println(j.solution(1081));
    }
    public int solution(int chicken) {
        int answer = 0;
        while(chicken>=10){
            answer += chicken/10;
            chicken = chicken/10 + chicken%10;
        }
        return answer;
    }
}
