package programmers.level0;
import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/120911
// 문자열 정렬하기(2)
public class No_53 {
    public static void main(String[] args) {
        No_53 j = new No_53();
        System.out.println(j.solution("Bcad"));
    }
    public String solution(String my_string) {
        char[] answer = my_string.toLowerCase().toCharArray();
        Arrays.sort(answer);
        return new String(answer);
    }
}
