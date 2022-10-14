package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120829
//각도기
public class No_08 {
    public static void main(String[] args) {
        No_08 j = new No_08();
        System.out.println(j.solution(180));
    }
    public int solution(int angle) {
        int answer=0;
        if(angle<90) answer=1;
        else if(angle==90) answer=2;
        else if(angle<180) answer=3;
        else if(angle==180) answer=4;
        return answer;
        //return angle<90 ? 1 : angle==90 ? 2 : angle<180 ? 3 : angle==180 ? 4 : 0;
    }
}
