package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120913
//잘라서 배열로 저장하기
public class No_73 {
    public static void main(String[] args) {
        No_73 j = new No_73();
        System.out.println( j.solution("abc1Addfggg4556b",6));
    }
    public String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length()%n==0 ? my_str.length()/n : my_str.length()/n+1];
        for(int i=0; i<answer.length; i++){
            answer[i] = my_str.substring(i*n, Math.min( my_str.length(), (i*n)+n));
            System.out.println(answer[i]);
        }
        return answer;
    }
}
