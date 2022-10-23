package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120847
//최댓값 만들기(1)
public class No_26 {
    public static void main(String[] args) {
        No_26 j = new No_26();
        int[] numbers = {0,31,24,10,1,9};
        System.out.println(j.solution(numbers));
    }
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(answer<numbers[i]*numbers[j]) answer=numbers[i]*numbers[j];
            }
        }
        return answer;
    }
}
