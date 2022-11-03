package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120904
//숫자 찾기
public class No_51 {
    public static void main(String[] args){
        No_51 j = new No_51();
        System.out.println(j.solution(232443,4));
    }
    public int solution(int num, int k) {
        String S = String.valueOf(num);
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i)==String.valueOf(k).charAt(0)){
                return i+1;
            }
        }
        return -1;
    }
}
