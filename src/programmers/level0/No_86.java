package programmers.level0;
import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/120812
// 최빈값 구하기
public class No_86 {
    public static void main(String[] args) {
        No_86 j = new No_86();
        int[] array = {1,9,1,3,2,9};
        System.out.println(j.solution(array));
    }
    public int solution(int[] array) {
        LinkedHashSet <Integer> intList = new LinkedHashSet<>();
        for(int idx : array){
            intList.add(idx);
        } // 숫자의 종류
        int[] num = intList.stream().mapToInt(Integer::intValue).toArray();
        int[] numCount = new int[num.length];
        for(int i=0; i<num.length; i++){
            int count = 0;
            for(int j = 0; j<array.length; j++){
                if(num[i] == array[j]) count++;
            }
            numCount[i]=count;
        }// 숫자별 갯수
        int answer = num[0];
        int maxNum = numCount[0];
        for(int i=0; i<num.length; i++){
            if(maxNum<numCount[i]){
                maxNum = numCount[i];
                answer = num[i];
            }
        }// 최대 중복 횟수
        int count=0;
        for(int i=0; i<numCount.length; i++){
            if(maxNum==numCount[i]) count++;
        }// 최빈값이 두개 이상인가
        return count>1 ? -1 : answer;
    }
}
