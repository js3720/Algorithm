package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120894
//영어가 싫어요
public class No_74 {
    public static void main(String[] args) {
        No_74 j = new No_74();
        System.out.println(j.solution("onetwothreefourfivesixseveneightnine"));
    }
    public long solution(String numbers) {
        String[] Eng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0; i<10; i++){
            numbers = numbers.replace(Eng[i],i+"");
        }
        return Long.parseLong(numbers);
    }
}
