package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120851
//숨어있는 숫자의 덧샘 (1)
public class No_46 {
    public static void main(String[] args) {
        No_46 j = new No_46();
        System.out.println(j.solution("aAb1B2cC34oOp"));
    }
    public int solution(String my_string) {
        int answer = 0;
        char[] ch = my_string.toCharArray();
        for(int i : ch){
            if(i>48 && i<58) answer+=i-48;
        }
        return answer;
    }
}
