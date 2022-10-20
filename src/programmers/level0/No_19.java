package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120824
//짝수 홀수 개수
public class No_19 {
    public static void main(String[] args) {
        No_19 j = new No_19();
        int[] num_list = {1,2,3,4,5};
        System.out.println(j.solution(num_list));
    }
    public int[] solution(int[] num_list) {
        int n = 0;
        int m = 0;
        for(int i : num_list) {
            if (i % 2 == 0) n++;
            else m++;
        }
        int[] answer = {n,m};
        return answer;
        // answer[num_list[i] % 2]++; 짝수면 0번배열이 카운팅, 홀수면 1번배열이 카운팅 되게끔 할 수 있음
    }
}
