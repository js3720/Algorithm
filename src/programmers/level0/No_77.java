package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120902
//문자열 계산하기
public class No_77 {
    public static void main(String[] args) {
        No_77 j = new No_77();
        System.out.println(j.solution("35+55"));
    }
    public int solution(String my_string) {
        String tmp = "";
        List <Integer> intList = new ArrayList<>();
        List <Character> charList = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i) >='0' || my_string.charAt(i) <='9'){
                tmp+=Character.toString(my_string.charAt(i));
                if(i==my_string.length()-1) intList.add(Integer.parseInt(tmp));
            }
            else if(!(my_string.charAt(i) >='0' || my_string.charAt(i) <='9')){
                intList.add(Integer.parseInt(tmp));
                tmp = "";
                charList.add(my_string.charAt(i));
            }
        }
        System.out.println(intList.get(0));
        System.out.println(intList.get(1));
        System.out.println(charList.get(0));
        return 0; // 아직 풀지 못한 문제 입니다
    }
}
