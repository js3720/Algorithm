package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120831
//짝수의 합
public class No_11 {
    public static void main(String[] args) {
        No_11 j = new No_11();
        System.out.println(j.solution(10));
    }
    public int solution(int n) {
        int answer = 0;
        for(int i=0; i<=n; i++)
        {
            if(i%2==0) answer+=i;
        }
        return answer;
    }
}
