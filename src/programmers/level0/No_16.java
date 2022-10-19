package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120898
//편진
public class No_16 {
    public static void main(String[] args) {
        No_16 j = new No_16();
        System.out.println(j.solution("happy birthday!"));
    }
    public int solution(String message) {
        return message.length()*2;
    }
}
