package programmers.level1;
// https://school.programmers.co.kr/learn/challenges?order=acceptance_desc&page=1&statuses=unsolved&levels=1&languages=java
// 하샤드 수
public class No_10 {
    public static void main(String[] args) {
        No_10 j = new No_10();
        System.out.println(j.solution(12));
    }
    public boolean solution(int x) {
        int sum = 0;
        for(int i=0; i<Integer.toString(x).length(); i++){
            sum += Integer.parseInt(Character.toString(Integer.toString(x).charAt(i)));
            System.out.println(sum);
        }
        return x%sum==0;
    }
}
