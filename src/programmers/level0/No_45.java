package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120825
//문자 반복 출력하기
public class No_45 {
    public static void main(String[] args) {
        No_45 j = new No_45();
        System.out.println(j.solution("hello",3));
    }
    public String solution(String my_string, int n) {
        char[] temp = my_string.toCharArray();
        char[] answer = new char[my_string.length()*n];
        for(int i=0; i<my_string.length()*n; i+=n){
            for(int j=0; j<n; j++){
                answer[i+j]=temp[i];
            }
        }
        return new String(answer);
    }
}
