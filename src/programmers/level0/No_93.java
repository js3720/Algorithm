package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120880
//특이한 정렬
public class No_93 {
    public static void main(String[] args) {
        No_93 j = new No_93();
        System.out.println(Arrays.toString(j.solution(new int[] {1,2,3,4,5,6}, 4)));
    }
    public int[] solution(int[] numlist, int n) {
        List <Integer> answer = new ArrayList<>();
        int[] temp = new int[numlist.length];
        for(int i=0; i<numlist.length; i++){
            temp[i] = numlist[i]-n<0 ? (numlist[i]-n)*-1 : numlist[i]-n;
        }
        int[] sort = temp.clone();
        Arrays.sort(sort);
        for(int i=0; i<sort.length; i++){
            int wait=0;
            int count=0;
            for(int j=0; j<numlist.length; j++){
                if(sort[i]==temp[j]){
                    if(count==0){
                        wait = numlist[j];
                        count++;
                    }
                    else {
                        count++;
                        answer.add(Math.max(wait, numlist[j]));
                        answer.add(Math.min(wait, numlist[j]));
                    }
                }
            }
            if(count==1) answer.add(wait);
            else i++;
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
        //return Arrays.stream(numList)
        //                .boxed()
        //                .sorted((a, b) -> Math.abs(a - n) == Math.abs(b - n) ? b.compareTo(a) : Integer.compare(Math.abs(a - n), Math.abs(b - n)))
        //                .mapToInt(Integer::intValue)
        //                .toArray();
    }
}
