package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120843
//공 던지기
public class No_72 {
    public static void main(String[] args) {
        No_72 j = new No_72();
        System.out.println(j.solution(new int[]{1, 2, 3, 4, 5, 6}, 5));
    }
    public int solution(int[] numbers, int k) {
        int i=0;
        int answer=0;
        while(k!=0){
            answer = i;
            k--;
            i+=2;
            if(i>numbers.length) i-= numbers.length;
        }
        return numbers[answer];
    }
}
