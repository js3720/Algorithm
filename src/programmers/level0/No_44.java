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
        my_string= my_string.replace("a","");
        my_string= my_string.replace("e","");
        my_string= my_string.replace("i","");
        my_string= my_string.replace("o","");
        my_string= my_string.replace("u","");
        return my_string;
    } // my_string.replaceAll("[a,e,i,o,u]","");
}

