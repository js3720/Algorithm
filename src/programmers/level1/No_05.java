package programmers.level1;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/12932
//자연수 뒤집어 배열로 만들기
public class No_05 {
    public static void main(String[] args) {
        No_05 j = new No_05();
        System.out.println(Arrays.toString(j.solution(12345)));
    }
    public int[] solution(long n) {
        List <Integer> nList = new ArrayList<>();
        String str = Long.toString(n);
        for(int i=1; i<=str.length(); i++){
            nList.add(str.charAt(str.length()-i)-'0');
        }
        return nList.stream().mapToInt(Integer::intValue).toArray();
    }// return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
}
