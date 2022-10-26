package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120811
//중앙값 구하기
public class No_38 {
    public static void main(String[] args) {
        No_38 j = new No_38();
        int[] array = {1, 2, 7, 10, 11};
        System.out.println(j.solution(array));
    }
    public int solution(int[] array) {
        int temp;
        for (int a = 0; a < array.length; a++) {
            for (int b = a + 1; b < array.length; b++) {
                if (array[a] > array[b]) {
                    temp = array[b];
                    array[b] = array[a];
                    array[a] = temp;
                }
            }
        }// Arrays.sort(array);
        return array[array.length/2];
    }
}