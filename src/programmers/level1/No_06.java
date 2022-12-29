package programmers.level1;
// https://school.programmers.co.kr/learn/courses/30/lessons/12916
// 문자열 내 p와 y의 개수
public class No_06 {
    public static void main(String[] args) {
        No_06 j = new No_06();
        System.out.println(j.solution("pPoooyY"));
    }
    boolean solution(String s) {
        int pCount =0;
        int yCount =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='p' || s.charAt(i)=='P') pCount++;
            else if(s.charAt(i)=='y' || s.charAt(i)=='Y') yCount++;
        }
        return pCount==yCount;
    }
}
