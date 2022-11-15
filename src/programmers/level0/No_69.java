package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120885
//2진수 더하기
public class No_69 {
    public static void main(String[] args){
        No_69 j = new No_69();
        System.out.println(j.solution("10","11"));
    }
    public String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1,2)+Integer.parseInt(bin2,2));
    }
}
