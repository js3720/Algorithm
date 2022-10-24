package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120813
//짝수는 싫어요
public class No_30 {
    public static void main(String[] args) {
        No_30 j = new No_30();
        System.out.println(j.solution(15));
    }
    public int[] solution(int n) {
        int[] answer = new int[n%2==0 ? n/2 : n/2+1];
        int idx=0;
        for(int i=1; i<=n; i++){
            if(i%2==1) {
                answer[idx]=i;
                idx++;
            }
        }
        return answer;
    }
}
