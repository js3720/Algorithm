package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120814
//피자 나눠 먹기(1)
public class No_20 {
    public static void main(String[] args) {
        No_20 j = new No_20();
        System.out.println(j.solution(71));
    }
    public int solution(int n) {
        return n%7==0 ? n/7 : (n/7)+1;
    }
}
