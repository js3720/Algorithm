package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120845
//주사위의 개수
public class No_55 {
    public static void main(String[] args) {
        No_55 j = new No_55();
        int[] box = {10,8,6};
        System.out.println(j.solution(box, 3));
    }
    public int solution(int[] box, int n) {
        return (int)((box[0]/n)*(box[1]/n)*(box[2]/n));
    }
}