package programmers.level1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12928
//약수의 합
public class No_02 {
    public static void main(String[] args) {
        No_02 j = new No_02();
        System.out.println(j.solution(12));
    }
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) if(n%i==0) answer+=i;
        return answer;
    }
}
