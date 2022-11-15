package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120922
//종이 자르기
public class No_75 {
    public static void main(String[] args) {
        No_75 j = new No_75();
        System.out.println(j.solution(2,5));
    }
    public int solution(int M, int N) {
        return M*N-1;
    }
}
