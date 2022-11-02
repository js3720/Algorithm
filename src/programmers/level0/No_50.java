package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120834
//외계행성의 나이
public class No_50 {
    public static void main(String[] args){
        No_50 j = new No_50();
        System.out.println(j.solution(100));
    }
    public String solution(int age) {
        String tmp = String.valueOf(age);
        String answer = "";
        for(int i=0; i<tmp.length(); i++){
            answer += (char)(tmp.charAt(i)+49);
        }
        return answer;
    } // return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
}
