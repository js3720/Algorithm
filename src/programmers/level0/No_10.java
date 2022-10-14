package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120583
//중복된 숫자 개수
public class No_10 {
    public static void main(String[] args) {
        No_10 j = new No_10();
        int[] array= {1,1,2,3,4,5};
        int n = 1;
        System.out.println(j.solution(array,1));
    }
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i=0; i<array.length; i++) // for (int num : array)
        {
            if(array[i]==n) answer++;
        }
        return answer;
    }
}
