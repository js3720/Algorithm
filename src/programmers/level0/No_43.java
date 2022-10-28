package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120826
//특정 문자 제거하기
public class No_43 {
    public static void main(String[] args){
        No_43 j = new No_43();
        System.out.println(j.solution("abcdef","f"));
    }
    public String solution(String my_string, String letter) {
        return my_string.replace(letter,"");
    }
}
