package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120893
//대문자와 소문자
public class No_57 {
    public static void main(String[] args) {
        No_57 j = new No_57();
        System.out.println(j.solution("cccCCC"));
    }
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i) <=(int)'Z') answer+=my_string.toLowerCase().charAt(i);
            else if(my_string.charAt(i) >= (int)'a') answer+=my_string.toUpperCase().charAt(i);
        }
        return answer;
    }
}
