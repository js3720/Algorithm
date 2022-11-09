package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120846
//합성수 찾기
public class No_61 {
    public static void main(String[] args){
        No_61 j = new No_61();
        System.out.println(j.solution(10));
    }
    public int solution(int n){
        int answer = 0;
        int count = 0;
        for(int i=4; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i%j==0) count++;
            }
            if(count>2) {
                answer++;
                count = 0;
            }
        }
        return answer;
    }
}
