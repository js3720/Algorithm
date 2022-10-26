package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120903
//배열의 유사도
public class No_40 {
    public static void main(String[] args) {
        No_40 j = new No_40();
        String[] s1 = {"a","b","c"};
        String[] s2 = {"com","b","d","p","c"};
        System.out.println(j.solution(s1,s2));
    }
    public int solution(String[] s1, String[] s2) {
        int answer =0;
        for (int a = 0; a < s1.length; a++) {
            for (int b = 0; b < s2.length; b++) {
                if (s1[a].equals(s2[b])) answer++;
            }
        }
        return answer;
    }
}
