package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120809
//배열 두배 만들기
public class No_28 {
    public static void main(String[] args) {
        No_28  j = new No_28();
        int[] numbers = {1,2,3,4,5};
        System.out.println(j.solution(numbers));
    }
    public int[] solution(int[] numbers) {
        int[] enswer = new int[numbers.length];
        for(int i=0; i< numbers.length; i++){
            enswer[i]=numbers[i]*2;
        }
        return enswer;
    }
}