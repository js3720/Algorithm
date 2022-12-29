package programmers.level1;
// https://school.programmers.co.kr/learn/courses/30/lessons/12934
// 정수 제곱근 판별
public class No_07 {
    public static void main(String[] args) {
        No_07 j = new No_07();
        System.out.println(j.solution(121));
    }
    public long solution(long n) {
        for(long i=1; i*i<=n; i++){
            if(i*i==n) return (i+1)*(i+1);
        }
        return -1;
    }
}
