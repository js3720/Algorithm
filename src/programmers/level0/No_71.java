package programmers.level0;
import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/120896
//한번만 등장한 문자
public class No_71 {
    public static void main(String[] args){
        No_71 j = new No_71();
        System.out.println(j.solution("abcabcadc"));
    }
    public String solution(String s) {
        String temp = "";
        for(int i=0; i<s.length(); i++){
            int count =0;
            for(int j=0; j<s.length(); j++){
                if(i!=j && s.charAt(i)==s.charAt(j)) count++;
            }
            if(count==0) temp += s.charAt(i);
        }
        char[] answer = temp.toCharArray();
        Arrays.sort(answer);
        return new String(answer);
    }
}
