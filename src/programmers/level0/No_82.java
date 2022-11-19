package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120860
//직사각형의 넓이 구하기
public class No_82 {
    public static void main(String[] args){
        No_82 j = new No_82();
        int[][] dots = {{-1,-1},{1,1},{1,-1},{-1,1}};
        System.out.println(j.solution(dots));
    }
    public int solution(int[][] dots) {
        int xGap, yGap;
        xGap = yGap = 0;
        for(int i=1; i<4; i++){
            if(dots[i][0] != dots[0][0] && dots[i][0]>dots[0][0]) xGap = dots[i][0]-dots[0][0];
            else if(dots[i][0] != dots[0][0] && dots[i][0]<dots[0][0]) xGap = dots[0][0]-dots[i][0];
            if(dots[i][1] != dots[0][1] && dots[i][1]>dots[0][1]) yGap = dots[i][1]-dots[0][1];
            else if(dots[i][1] != dots[0][1] && dots[i][1]<dots[0][1]) yGap = dots[0][1]-dots[i][0];
        }
        return xGap*yGap;
    }
}
