package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120837
//개미 군단
public class No_32 {
    public static void main(String[] args) {
        No_32 j = new No_32();
        System.out.println(j.solution(999));
    }
    public int solution(int hp) {
        int answer = 0;
        int num = hp;
        while(num!=0){
            if(num>=5) {num-=5; answer++;}
            else if(num>=3) {num-=3; answer++;}
            else {num--; answer++;}
        }
        return answer;
    }
}
