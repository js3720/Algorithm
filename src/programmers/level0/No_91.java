package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120871
//저주의 숫자 3
public class No_91 {
    public static void main(String[] args) {
        No_91 j = new No_91();
        System.out.println(j.solution(40));
    }
    public int solution(int n) {
        int answer=1;
        int count=1;
        while(count<=n){
            if(answer%3==0){
                answer++;
                continue;
            }
            if(String.valueOf(answer).contains("3")){
                answer++;
                continue;
            }
            if(count!=n){
                count++;
                answer++;
            }
            else count++;
        }
        return answer;
    }
}
