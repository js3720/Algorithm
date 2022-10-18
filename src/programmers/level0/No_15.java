package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120841
//점의 위치 구하기
public class No_15 {
    public static void main(String[] args) {
        No_15 j = new No_15();
        int dot[] = {-7,4};
        System.out.println(j.solution(dot));
    }
    public int solution(int[] dot) {
        return  dot[0]>0 && dot[1]>0 ? 1 : dot[0]<0 && dot[1]>0 ? 2 : dot[0]<0 && dot[1]<0 ? 3 : dot[0]>0 && dot[1]<0 ? 4 : 0;
    }
}
