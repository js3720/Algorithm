package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120852
//소인수분해
public class No_79 {
    public static void main(String[] args){
        No_79 j = new No_79();
        System.out.println(Arrays.toString(j.solution(4200)));
    }
    public int[] solution(int n) {
        LinkedHashSet <Integer> intList = new LinkedHashSet<>();
        while(n!=1){
            if(n%2==0) {
                n/=2;
                intList.add(2);
            }
            else{
                for(int i=3; i<=n; i++){
                    if(n%i==0){
                        n/=i;
                        intList.add(i);
                        break;
                    }
                }
            }
        }
        return  intList.stream().mapToInt(Integer::intValue).toArray();
    }
}
