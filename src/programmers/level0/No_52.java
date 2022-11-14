package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120850
//문자열 정렬하기(1)
public class No_52 {
    public static void main(String[] args) {
        No_52 j = new No_52();
        System.out.println(Arrays.toString(j.solution("hi12392")));
    }
    public int[] solution(String my_string) {
        List<Integer> enswer = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
           if( my_string.charAt(i) >=(char)48 && my_string.charAt(i) <(char)58 ){
                enswer.add(Character.getNumericValue(my_string.charAt(i)));
            }
        }
        Collections.sort(enswer);
        System.out.println(enswer);
//        for(char c : my_string.toCharArray()){
//            if(Character.isDigit(c)){
//                enswer.add(Integer.valueOf(String.valueOf(c)));
//            }
//        }
        //Collections.sort = 해당 객체의 기본 정렬 기준만 적용됨
        Collections.sort(enswer);
        System.out.println(enswer);
        return  enswer.stream().mapToInt(Integer::intValue).toArray();
    }
}
