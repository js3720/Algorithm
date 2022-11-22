package programmers.level0;
import  java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120883
//로그인 성공?
public class No_87 {
    public static void main(String[] args) {
        No_87 j = new No_87();
        String[] id_pw = {"meosseug", "123"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        System.out.println(j.solution(id_pw,db));
    }
    public String solution(String[] id_pw, String[][] db) {
        String answer ="fail";
        for(int i=0; i<db.length; i++){
            if(db[i][0].equals(id_pw[0])) {
                if(db[i][1].equals(id_pw[1])) {
                    answer = "login";
                    break;
                }
                else if(!db[i][1].equals(id_pw[1])){
                    answer = "wrong pw";
                }
            }
        }
        return answer;
    }
}
