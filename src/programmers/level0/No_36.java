package programmers.level0;
public class No_36 {
    public static void main(String[] args) {
        No_36 j = new No_36();
        System.out.println(j.solution(100));
    }
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i*j==n) answer++;
            }
        }
        return answer;
    }
}
