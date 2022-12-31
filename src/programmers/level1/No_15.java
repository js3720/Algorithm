package programmers.level1;
// https://school.programmers.co.kr/learn/courses/30/lessons/12919
// 서울에서 김서방 찾기
public class No_15 {
    public static void main(String[] args) {
        No_15 j = new No_15();
        System.out.println(j.solution(new String[] {"Jane", "Kim"}));
    }
    public String solution(String[] seoul) {
        int answer = 0;
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim"))  answer = i;
        }
        return "김서방은 "+answer+"에 있다";
    }
}
