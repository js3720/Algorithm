package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120909
//제곱수 판별하기
public class No_29 {
    public static void main(String[] args) {
        No_29 j = new No_29();
        System.out.println(j.solution(144));
    }
    public int solution(int n) {
        int enswer =2;
        for(int i=0; i<n; i++){
            if(i*i==n) enswer=1;
        }
        return enswer;
    }
}
