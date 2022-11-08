package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120891
//369게임
public class No_59 {
    public static void main(String[] args) {
        No_59 j = new No_59();
        System.out.println(j.solution(103));
    }
    public int solution(int order) {
        int answer = 0;
        String num = String.valueOf(order);
        for(int i=0; i<num.length(); i++){
            System.out.println(num.charAt(i));
            if(num.charAt(i)>'0' && num.charAt(i)%3==0) answer++;
        }
        return answer;
    }
}
