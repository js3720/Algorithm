package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120585
//머쓱이보다 키 큰 사람 문제
public class No_14 {
    public static void main(String[] args) {
        No_14 j = new No_14();
        int array[] = {149, 180, 192, 170};
        System.out.println(j.solution(array,167));
    }
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int num :array){
            if(num>height) answer++;
        }
        return answer;
    }
}
