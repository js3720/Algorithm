package programmers.level1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12931
//자릿수 더하기
public class No_04 {
    public static void main(String[] args) {
        No_04 j = new No_04();
        System.out.println(j.solution(987));
    }
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        for(int i=0; i<s.length(); i++) answer+= s.charAt(i)-'0';
        return answer;
    }
}
