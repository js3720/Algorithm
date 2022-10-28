package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120849
//모음 제거
public class No_44 {
    public static void main(String[] args){
        No_44 j = new No_44();
        System.out.println(j.solution("bus"));
    }
    public String solution(String my_string) {
        List<Character> enswer = new ArrayList<>();
        char[] temp = my_string.toCharArray();
        for(int i=0; i<my_string.length(); i++){
            if( temp[i]!='a' && temp[i]!='e' && temp[i]!='i' && temp[i]!='o'&& temp[i]!='u' ) {
                enswer.add(temp[i]);
            }
        }
        return String.valueOf(enswer);
    }
}

