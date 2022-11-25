package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120921
//문자열 밀기
public class No_88 {
    public static void main(String[] args) {
        No_88 j = new No_88();
        System.out.println(j.solution("hello","llohe"));
    }
    public int solution(String A, String B) {
        int answer = 0;
        if(A.equals(B)) return 0;
        else {
            for(int i=0; i<A.length(); i++){
                answer++;
                char temp = A.charAt(A.length()-1);
                A = temp+A.substring(0,A.length()-1);
                if(A.equals(B)) return answer;
            }
        }
        return -1;
    }
}
