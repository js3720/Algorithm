package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120848
//팩토리얼
public class No_66 {
    public static void main(String[] args) {
        No_66 j = new No_66();
        System.out.println(j.solution(7));
    }
    public int solution(int n) {
        for(int enswer=1; n>0; enswer++){
            n/=enswer;
            if(n==0 || n<1) return enswer-1;
        }
        return 0;
    }
}
