package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120816
//피자 나눠먹기 (3)
public class No_22 {
    public static void main(String[] args) {
        No_22 j = new No_22();
        System.out.println(j.solution(10,71));
    }
    public int solution(int slice, int n) {
        return n%slice==0 ? n/slice : n/slice+1;
    }
}