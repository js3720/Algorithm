package programmers.level1;
// https://school.programmers.co.kr/learn/courses/30/lessons/12925
// 문자열을 정수로 바꾸기
public class No_09 {
    public static void main(String[] args) {
        No_09 j = new No_09();
        System.out.println(j.solution("1234"));
    }
    public int solution(String s) {
        return Integer.parseInt(s);
    }
}
