package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120878
//유한소수 판별하기
public class No_83 {
    public static void main(String[] args) {
        No_83 j = new No_83();
        System.out.println(j.solution(13,42));
    }
    public int solution(int a, int b) {
        int divide = 1;
        for(int i=2; i<=a; i++){
            if(a%i==0 && b%i==0) divide=i;
        } // 최대공약수
        int n = b/divide; // 기약분수로 나타냈을 경우 분모의 값
        while(n!=1){ // 소인수분해
            if(n%2==0) n/=2;
            else if(n%5==0) n/=5;
            else return 2; // 소인수가 2나 5가 아닐 때 무한소수로 판별
        }
        return 1; // 유한소수로 판별
    }
}
