package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120830
//양꼬치 문제
public class No_13 {
    public static void main(String[] args) {
        No_13 j = new No_13();
        System.out.println(j.solution(10,3));
    }
    public int solution(int n, int k) {
        int answer = 0;
        int i;
        if(n>=10) {
            for(i=0; i<=n; i+=10){
                answer++;
            }
            if(i>n) answer--;
        }
        return (n*12000)+((k-answer)*2000);
    }
}
