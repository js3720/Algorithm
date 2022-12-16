package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120956
//옹알이(1)
public class No_100 {
    public static void main(String[] args) {
        No_100 j = new No_100();
        String[] s = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(j.solution(s));
    }
    public int solution(String[] babbling) {
        int answer = 0;
        for(String s : babbling){
            s= s.replaceFirst("aya","---");
            s= s.replaceFirst("ye","--");
            s= s.replaceFirst("woo","---");
            s= s.replaceFirst("ma","--");
            s= s.replace("-","");
            if(s.equals("")) answer++;
        }
        return answer;
    }
}
