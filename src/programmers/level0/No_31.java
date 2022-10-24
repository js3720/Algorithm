package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120910
//세균 증식
public class No_31 {
    public static void main(String[] args) {
        No_31 j = new No_31();
        System.out.println(j.solution(2,10));
    }
    public int solution(int n, int t) {
        int answer = n;
        for(int i=1; i<=t; i++){
            answer *=2;
        }
        return answer;
    }
}
