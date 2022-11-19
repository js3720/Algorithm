package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120868
//삼각형의 완성조건(2)
public class No_81 {
    public static void main(String[] args) {
        No_81 j = new No_81();
        System.out.println(j.solution(new int[] {11,7}));
    }
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        for(int n=0; n<=sides[1]; n++) if(sides[0]+n>sides[1]) answer++;
        for(int m=sides[1]+1; m<sides[0]+sides[1]; m++) answer++;
        return answer;
    }
}
