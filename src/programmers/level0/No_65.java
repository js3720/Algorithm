package programmers.level0;

import com.sun.jdi.IntegerValue;

import java.util.stream.Stream;

//https://school.programmers.co.kr/learn/courses/30/lessons/120887
//k의 개수
public class No_65 {
    public static void main(String[] args){
        No_65 j = new No_65();
        System.out.println(j.solution(1,13,1));
    }
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int num=i; i<=j; i++){
            String str = String.valueOf(i);
            for(int idx=0; idx<str.length(); idx++){
                if(String.valueOf(str.charAt(idx)).equals(String.valueOf(k))) answer++;
            }
        }
        return answer;
    }
}
