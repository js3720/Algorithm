package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120820
//나이 출력 (출생 년도 return)
public class No_07 {
    public static void main(String[] args) {
        No_07 j = new No_07();
        System.out.println(j.solution(40));
    }
    public int solution(int age) {
        return 2022-(age-1);
    }
}
