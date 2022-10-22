package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120815
//피자 나눠먹기 (2)
public class No_21 {
    public static void main(String[] args) {
        No_21 j = new No_21();
        System.out.println(j.solution(6));
    }
    public int solution(int n) {
        int answer = 1;
        while(true){
            if(n*answer%6==0) {return n*answer/6;}
            else answer++;
        }
    }
}
