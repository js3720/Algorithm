package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120808
//분수의 덧셈
public class No_85 {
    public static void main(String[] args) {
        No_85 j = new No_85();
        System.out.println(Arrays.toString(j.solution(9,2,1,3)));
    }
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int divide = 1;
        int a = denum1*num2 + denum2*num1; // 분자
        int b = num1*num2; // 분모
        for(int i=2; i<=a; i++){
            if(a%i==0 && b%i==0) divide=i;
        } // 최대공약수
        answer[0]=a/divide;
        answer[1]=b/divide;
        return answer;
    }
}
