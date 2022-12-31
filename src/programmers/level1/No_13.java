package programmers.level1;
// https://school.programmers.co.kr/learn/courses/30/lessons/12912
// 두 정수 사이의 합
public class No_13 {
    public static void main(String[] args) {
        No_13 j = new No_13();
        System.out.println(j.solution(3,5));
    }
    public long solution(int a, int b) {
        long answer = 0;
        if(a==b) return a;
        else
            for(int i=Math.min(a,b); i<=Math.max(a,b); i++) answer+=i;
        return answer;
    }
}
