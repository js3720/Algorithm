package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120839
//가위 바위 보
public class No_48 {
    public static void main(String[] args) {
        No_48 j = new No_48();
        System.out.println(j.solution("205"));
    }
    public String solution(String rsp) {
        String answer = "";
        for(int i=0; i<rsp.length(); i++){
            switch(rsp.charAt(i)){
                case '2' : answer+="0"; break;
                case '0' : answer+="5"; break;
                case '5' : answer+="2"; break;
                default : break;
            }
        }
        return answer;
    }
}
