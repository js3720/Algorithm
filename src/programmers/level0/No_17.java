package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120906
//자릿수 더하기
public class No_17 {
    public static void main(String[] args) {
        No_17 j = new No_17();
        System.out.println(j.solution(930211));
    }
    public int solution(int n) {
        return (n/1000000)+(n%1000000/100000)+(n%100000/10000)+(n%10000/1000)+(n%1000/100)+(n%100/10)+(n%10);
        // 나는 가장 큰 자리수 부터 더했지만, 가장 작은 자리수 부터 더하고, 10씩 나눠주면 편함
        // while(n>0) {answer += n%10; n/=10;}
        // return answer;
    }
}
