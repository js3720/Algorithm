package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120821
//배열 뒤집기
public class No_18 {
    public static void main(String[] args) {
        No_18 j = new No_18();
        int[] num_list = {1,2,3,4,5};
        System.out.println(j.solution(num_list));
    }
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[num_list.length-1-i];
        }
        return answer;
    }
}
