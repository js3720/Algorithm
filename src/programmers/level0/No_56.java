package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120862
//최댓값 만들기(2)
public class No_56 {
    public static void main(String[] args) {
        No_56 j = new No_56();
        int[] numbers = {0,-31,24,10,1,9};
        System.out.println(j.solution(numbers));
    }
    public int solution(int[] numbers) {
        int answer = numbers[0]*numbers[1];
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(answer<numbers[i]*numbers[j]&& i!=j) answer = numbers[i]*numbers[j];
            }
        }
        return answer;
    }
}
