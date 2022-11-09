package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120838
//모스부호
public class No_60 {
    public static void main(String[] args){
        No_60 j = new No_60();
        System.out.println(j.solution(".... . .-.. .-.. ---"));
    }
    public String solution(String letter) {
        String answer = "";
        String tmp = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char[] Eng = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i=0; i<letter.length(); i++){
            if(letter.charAt(i)!=' ') {
                tmp+= letter.charAt(i);
            }
            if(letter.charAt(i)==' ' || i==letter.length()-1){
                for(int j=0; j<morse.length; j++){
                    if(tmp.equals(morse[j])) answer+=Eng[j];
                }
                tmp="";
            }
        }
        return answer;
    }
}
