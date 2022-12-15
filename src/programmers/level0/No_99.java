package programmers.level0;
// https://school.programmers.co.kr/learn/courses/30/lessons/120875
// 평행
public class No_99 {
    public static void main(String[] args) {
        No_99 j = new No_99();
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        System.out.println(j.solution(dots));
    }
    public int solution(int[][] dots) {
        return (double)(dots[0][0]-dots[1][0])/(dots[0][1]-dots[1][1]) == (double)(dots[2][0]-dots[3][0])/(dots[2][1]-dots[3][1]) ||
                (double)(dots[0][0]-dots[2][0])/(dots[0][1]-dots[2][1]) == (double)(dots[1][0]-dots[3][0])/(dots[1][1]-dots[3][1]) ||
                (double)(dots[0][0]-dots[3][0])/(dots[0][1]-dots[3][1]) == (double)(dots[1][0]-dots[2][0])/(dots[1][1]-dots[2][1])  ? 1 : 0;
    }
    // [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
    // 4개중에 무작위로 2개씩 짝지어서  선을 그렸을 때 두 선분이 평행하면 1, 아니면 0
}
