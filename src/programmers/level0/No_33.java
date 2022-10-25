package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120905
//n의 배수 고르기
public class No_33  {
    public static void main(String[] args) {
        No_33 j = new No_33();
        int[] numlist = {4,5,6,7,8,9,10,11,12};
        System.out.println(j.solution(3,numlist));
    }
    public int[] solution(int n, int[] numlist) {
        List<Integer> List = new ArrayList<>();
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0) {
                List.add(numlist[i]);
            }
        }
        int [] answer = List.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    } // return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
}
