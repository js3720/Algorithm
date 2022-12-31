package programmers.level1;
// https://school.programmers.co.kr/learn/courses/30/lessons/12948
// 핸드폰 번호 가리기
public class No_16 {
    public static void main(String[] args) {
        No_16 j = new No_16();
        System.out.println(j.solution("01033334444"));
    }
    public String solution(String phone_number) {
        String s = "";
        for(int i=0; i<phone_number.length()-4; i++) s+= "*";
        return phone_number.replace(phone_number.substring(0,phone_number.length()-4), s);
    }
}
