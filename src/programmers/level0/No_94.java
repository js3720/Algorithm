package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120863
//다항식 더하기
public class No_94 {
    public static void main(String[] args) {
        No_94 j = new No_94();
        System.out.println(j.solution("x + 1"));
    }
    public String solution(String polynomial) {
        int xCount=0;
        int nCount=0;
        for(String s : polynomial.split(" ")){
            xCount += s.contains("x") ? s.length()==1 ? 1 : Integer.parseInt(s.replace("x","")) : 0;
            nCount += !(s.equals("+")) && !(s.contains("x")) ? Integer.parseInt(s) : 0 ;
        }
        String answer = xCount==0 ? Integer.toString(nCount) : nCount==0 ? xCount+"x" : xCount+"x + "+nCount;
        if(xCount==1) answer = answer.replace("1x","x");
        return answer;
    }
}
