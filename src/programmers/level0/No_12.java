package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120806
//두 수의 나눗셈
public class No_12 {
    public static void main(String[] args) {
        No_12 j = new No_12();
        System.out.println(j.solution(7,3));
    }
    public int solution(int num1, int num2) {
        double answer = (double)num1/(double)num2*1000;
        return (int)answer;
    }
}
