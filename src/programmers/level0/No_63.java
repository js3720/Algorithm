package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120842
//2차원으로 만들기
public class No_63 {
    public static void main(String[] args){
        No_63 j = new No_63();
        int[] num_list = {1,2,3,4,5,6,7,8};
        System.out.println(j.solution(num_list,2));
    }
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int idx = 0;
        for(int i=0; i<num_list.length/n; i++){
            for(int j=0; j<n; j++){
                answer[i][j] = num_list[idx++];
            }
        }
        return answer;
    }
}
