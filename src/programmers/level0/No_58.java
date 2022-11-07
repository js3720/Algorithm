package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120892
//암호 해독
public class No_58 {
    public static void main(String[] args) {
        No_58 j = new No_58();
        System.out.println(j.solution("dfjardstddetckdaccccdegk",4));
    }
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i=code-1; i<cipher.length(); i+=code){
            answer+=cipher.charAt(i);
        }
        return answer;
    }
}


