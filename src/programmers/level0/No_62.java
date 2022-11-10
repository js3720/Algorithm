package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120888
//중복된 문자 제거
public class No_62 {
    public static void main(String[] args) {
        No_62 j = new No_62();
        System.out.println(j.solution("people"));
    }
    public String solution(String my_string) {
        char[] answer = my_string.toCharArray();
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer.length; j++){
                if(i!=j && answer[i]==answer[j]) answer[j]='0';
            }
        }
        return new String(answer).replace("0","");
    }
}
