package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120908
//문자열안에 문자열
public class No_42 {
    public static void main(String[] args) {
        No_42 j = new No_42();
        System.out.println(j.solution("ab6CDE443fgh22iJKlmn1o","6CD"));
    }
    public int solution(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        int count =0;
        for(int i=0; i<str1.length(); i++){
            if(ch1[i] == ch2[count]) count++;
            else count=0;
            if(count==str2.length()) return 1;
        }
        return 2;
    }//return str1.contains(str2) ? 1: 2;
}
