package programmers.level0;

public class No_25 {
    public static void mian(String[] args) {
        No_25 j = new No_25();
        System.out.println(j.solution("jaron"));
    }
    public String solution(String my_string) {
        String answer = new StringBuffer(my_string).reverse().toString();
        return answer;
    }
    /*
String str = "Hello, world!";

char[] input = str.toCharArray();
char[] output = new char[input.length];
int startIndex = 0;
for (int i = (input.length-1); i >= 0; i--) {
    output[startIndex++] = input[i];
}
String reversed = new String(output);

System.out.println(reversed);
    * */
}
