package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120835
//진료순서 정하기
public class No_70 {
    public static void main(String[] args) {
        No_70 j = new No_70();
        int[] emergency = {2, 76, 24};
        System.out.println(Arrays.toString(j.solution(emergency)));
    }
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] temp = emergency.clone();
        Arrays.sort(temp);
        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++){
                if(temp[i]==emergency[j]) answer[j]= emergency.length-i;
            }
        }
        return answer;
    }
}
