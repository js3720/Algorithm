package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120854
//배열 원소의 길이
public class No_23 {
    public static void main(String[] args) {
        No_23 j = new No_23();
        String[] strlist ={"We","are","the","world!"};
        System.out.println(j.solution(strlist));
    }
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i=0; i< strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
    //import java.util.Arrays;
    //return Arrays.stream(strList).mapToInt(String::length).toArray();
}
