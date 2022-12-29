package programmers.level1;
import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/12933
// 정수 내림차순으로 배치하기
public class No_11 {
    public static void main(String[] args) {
        No_11 j = new No_11();
        System.out.println(j.solution(118372));
    }
    public long solution(long n) {
        String str= "";
        int[] num = new int[Long.toString(n).length()];
        for(int i=0; i<Long.toString(n).length(); i++){
            num[i] = Integer.parseInt(Character.toString(Long.toString(n).charAt(i)));
        }
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i]<num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
            str += Integer.toString(num[i]);
        }
        return Long.parseLong(str);
    }
}
