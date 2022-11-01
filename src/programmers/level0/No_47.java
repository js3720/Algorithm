package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120864
//숨어있는 숫자의 덧샘 (2)
public class No_47 {
    public static void main(String[] args) {
        No_47 j = new No_47();
        System.out.println(j.solution("aAb1B2cC34oOp"));
    }
    public int solution(String my_string) {
        int answer = 0;
        int count = 0;
        String tmp ="";
        char[] ch = my_string.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i]>48 && ch[i]<58) count++;
            else if(count>0){
                for(int j=count; j>0; j--){
                    tmp += ch[i-j];
                }
                answer += Integer.parseInt(tmp) ;
                count=0;
                tmp ="";
            }
        }
        return answer;
    }
}
