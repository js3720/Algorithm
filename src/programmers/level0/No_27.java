package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120899
//가장 큰 수 찾기
public class No_27 {
    public static void main(String[] args) {
        No_27  j = new No_27();
        int[] array = {1,8,3};
        System.out.println(j.solution(array));
    }
    public int[] solution(int[] array) {
        int[] answer = {0,0};
        for(int i=0; i<array.length; i++){
            if(answer[0]<array[i]) {
                answer[0]=array[i];
                answer[1]=i;
            }
        }
        return answer;
    }
}
