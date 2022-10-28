package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120895
//인덱스 바꾸기
public class No_41 {
    public static void main(String[] args) {
        No_41 j = new No_41();
        System.out.println(j.solution("hello",1,2));
    }
    public String solution(String my_string, int num1, int num2) {
        char[] ms = my_string.toCharArray();
        char temp = ms[num1];
        ms[num1] = ms[num2];
        ms[num2] = temp;
        return new String(ms);
    }
}
