package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120817
//배열의 평균값
public class No_09 {
    public static void main(String[] args) {
        No_09 j = new No_09();
        int[] numbers= {1,2,3,4,5,6,7,8,9,10};
        System.out.println(j.solution(numbers));
    }
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i=0; i<numbers.length; i++)
        {
            answer += numbers[i];
        }
        return answer/numbers.length;
    }
    // import java.util.Arrays; 해준 뒤
    // return Arrays.stream(numbers).average().orElse(0); 하면 평균값 바로 출력 가능
}
