package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120907
//OX퀴즈
public class No_95 {
    public static void main(String[] args) {
        No_95 j = new No_95();
        System.out.println(Arrays.toString(j.solution(new String[] {"3 - 4 = -3", "5 + 6 = 11"})));
    }
    public String[] solution(String[] quiz) {
        for(int i=0; i<quiz.length; i++) {
            quiz[i] = boo(quiz[i]);
        }
        return quiz;
    }
    public String boo(String str) {
        String[] xyz = str.split(" ");
        int temp = xyz[1].equals("+") ? Integer.parseInt(xyz[0])+Integer.parseInt(xyz[2]) : Integer.parseInt(xyz[0])-Integer.parseInt(xyz[2]);
        return temp==Integer.parseInt(xyz[4]) ? "O" : "X";
    }
}
