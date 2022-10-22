package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120819
//아이스 아메리카노
public class No_24 {
    public static void mian(String[] args) {
        No_24 j = new No_24();
        System.out.println(j.solution(5500));
    }
    public int[] solution(int money) {
        int[] answer = {0, money};
        while(answer[1]>=5500) {
            answer[1]-=5500;
            answer[0]++;
        }
        return answer;
    }// return new int[] { money / 5500, money % 5500 };
}
