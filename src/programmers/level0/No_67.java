package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120886
//A로 B 만들기
public class No_67 {
    public static void main(String[] args) {
        No_67 j = new No_67();
        System.out.println(j.solution("olleh","hello"));
    }
    public int solution(String before, String after) {
        StringBuilder sb = new StringBuilder(before);
        sb.reverse();
        return sb.toString().equals(after) ? 1 : 0;
    }
}
