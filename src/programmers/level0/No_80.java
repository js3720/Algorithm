package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120861
//캐릭터의 좌표
public class No_80 {
    public static void main(String[] args){
        No_80 j = new No_80();
        System.out.println(Arrays.toString(j.solution(new String[] {"left", "right", "up", "right", "right"}, new int[] {11,11})));
    }
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        for(String s : keyinput){
            if(s.equals("left") && answer[0]>(board[0]/2)*-1) answer[0]--;
            else if(s.equals("right") && answer[0]<board[0]/2) answer[0]++;
            else if(s.equals("up") && answer[1]<board[1]/2) answer[1]++;
            else if(s.equals("down") && answer[1]>(board[1]/2)*-1) answer[1]--;
        }
        return answer;
    }
}
