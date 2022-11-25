package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120853
//컨트롤제트
public class No_89 {
    public static void main(String[] args) {
        No_89 j = new No_89();
        System.out.println(j.solution("10 Z 20 Z 1"));
    }
    public int solution(String s) {
        List <Integer> answer = new ArrayList<>();
        String[] str = s.split(" ");
        for(String i : str){
            i.replace(" ", "");
            if(!(i.equals("Z"))){
                answer.add(Integer.parseInt(i));
            }
            else answer.remove(answer.size()-1);
        }
        return Arrays.stream(answer.stream().mapToInt(Integer::intValue).toArray()).sum();
    }
}
