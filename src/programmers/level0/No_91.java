package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120871
//저주의 숫자 3
public class No_91 {
    public static void main(String[] args) {
        No_91 j = new No_91();
        System.out.println(j.solution(40));
    }
    public int solution(int n) {
        int count=0;
        for(int i=0; i<=n; i++){
            if(i%3==0 || i%10==3 || (i+count)%3==0 || (i+count)%10==3) count++;
        }
        return n+count;
    }
}
