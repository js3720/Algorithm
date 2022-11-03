package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120850
//문자열 정렬하기(1)
public class No_52 {
    public static void main(String[] args) {
        No_52 j = new No_52();
        System.out.println(j.solution("hi12392"));
    }
    public int[] solution(String my_string) {
        List<Integer> enswer = new ArrayList<Integer>();
        for(int i=0; i<my_string.length(); i++){
            if( my_string.charAt(i) >=(char)48 && my_string.charAt(i) <(char)58 ){
                enswer.add(Character.getNumericValue(my_string.charAt(i)));
            }
        }
        Collections.sort(enswer);
        System.out.println(enswer);
        return  enswer.stream().mapToInt(Integer::intValue).toArray();
    }
}
