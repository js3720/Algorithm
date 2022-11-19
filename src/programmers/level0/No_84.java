package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120882
//등수 매기기
public class No_84 {
    public static void main(String[] args) {
        No_84 j = new No_84();
        int[][] score = {{80, 70}, {70, 81}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        System.out.println(Arrays.toString(j.solution(score)));
    }
    public int[] solution(int[][] score) {
        int rank =1;
        int count=0;
        int[] answer = new int[score.length];
        double[] average = new double[score.length];
        double[] temp = new double[score.length];
        for(int i=0; i<score.length; i++){
            average[i] = ((double)score[i][0]+score[i][1])/2;
        }
        temp = average.clone();
        Arrays.sort(temp);
        for(int i=0; i<temp.length; i+=count){
            count=0;
            for(int j=0; j<average.length; j++){
                if(temp[temp.length-1-i]==average[j]){
                    answer[j] = rank;
                    count++;
                }
            }
            rank+=count;
        }
        return answer;
    }
}
