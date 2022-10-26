package programmers.level0;
public class No_36 {
    public static void main(String[] args) {
        No_36 j = new No_36();
        System.out.println(j.solution(100));
    }
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0) answer++;
        }
        return answer;
    } // 약수의 개수 == 순서쌍의 개수 이므로
}
