package programmers.level1;
// https://school.programmers.co.kr/learn/courses/30/lessons/76501
// 음양 더하기
public class No_19 {
    public static void main(String[] args) {
        No_19 j = new No_19();
        System.out.println(j.solution(new int[] {4,7,12}, new boolean[] {true,false,true}));
    }
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0; i<signs.length ; i++) answer += signs[i] ? absolutes[i] : absolutes[i]*-1;
        return answer;
    }
}
