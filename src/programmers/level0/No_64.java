package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120912
//7의 개수
public class No_64 {
    public static void main(String[] args) {
        No_64 j = new No_64();
        int[] array = {7,77,17};
        System.out.println(j.solution(array));
    }
    public int solution(int[] array) {
        int answer = 0;
        String tmp = "";
        for(int i=0; i<array.length; i++){
            tmp = String.valueOf(array[i]);
            for(int j=0; j<tmp.length(); j++){
                if(tmp.charAt(j)=='7') answer++;
            }
        }
        return answer;
    }
}
