package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120902
//문자열 계산하기
public class No_77 {
    public static void main(String[] args) {
        No_77 j = new No_77();
        String my_string = "33+55-32";
        System.out.println(j.solution(my_string));
    }
    public int solution(String my_string) {
        String tmp = "";
        int answer =0;
        List <Integer> intList = new ArrayList<>();
        List <Character> charList = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i) >='0' && my_string.charAt(i) <='9'){
                tmp+=Character.toString(my_string.charAt(i));
                if(i==my_string.length()-1) intList.add(Integer.parseInt(tmp));
            }
            else if(my_string.charAt(i) != ' ') {
                intList.add(Integer.parseInt(tmp));
                tmp = "";
                charList.add(my_string.charAt(i));
            }
        }
        for(int i=0, j=0; j<charList.size(); j++) {
            if(j==0){
                if(charList.get(j)=='+') answer += intList.get(i++)+intList.get(i++);
                else answer += intList.get(i++)-intList.get(i++);
            }
            else{
                if(charList.get(j)=='+') answer += intList.get(i++);
                else answer -= intList.get(i++);
            }
        }
        return answer;
    }
}
