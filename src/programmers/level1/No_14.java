package programmers.level1;
// https://school.programmers.co.kr/learn/courses/30/lessons/12943
// 콜라츠 추측
public class No_14 {
    public static void main(String[] args) {
        No_14 j = new No_14();
        System.out.println(j.solution(626331));
    }
    public int solution(long num) {
        int answer = 0;
        while(num!=1){
            num = num%2==0 ? num/2 : (num*3)+1;
            answer++;
            if(answer==500) return -1;
        }
        return answer;
    }
}
