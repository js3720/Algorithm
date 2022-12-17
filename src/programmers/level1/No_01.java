package programmers.level1;
// https://school.programmers.co.kr/learn/courses/30/lessons/12937
//  짝수와 홀수
public class No_01 {
    public static void main(String[] args) {
        No_01 j = new No_01();
        System.out.println(j.solution(3));
    }
    public String solution(int num) {
        return num%2==0 ? "Even" : "Odd";
    }
}
