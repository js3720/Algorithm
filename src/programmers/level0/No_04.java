package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120807
//숫자비교하기
public class No_04 {
    public static void main(String[] args) {
        No_04 j = new No_04();
        System.out.println(j.solution(2,2));
    }
    public int solution(int num1, int num2) {
        if(num1==num2) {
            return 1;
        }
        else return -1;
    } //return num1 == num2 ? 1 : -1;
}
