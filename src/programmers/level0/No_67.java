package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120886
//A로 B 만들기
public class No_67 {
    public static void main(String[] args) {
        No_67 j = new No_67();
        System.out.println(j.solution("olleh","hellod"));
    }
    public int solution(String before, String after) {
        char[] ch1 = before.toCharArray();
        char[] ch2 = after.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.toString(ch1).equals(Arrays.toString(ch2)) ? 1: 0;
    } // 배열 뒤집어서 비교할 때는 return new StringBuilder(before).reverse().toString().equals(after) ? 1 : 0;
}
