package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120889
//삼각형의 완성조건 (1)
public class No_37 {
    public static void main(String[] args) {
        No_37 j = new No_37();
        int[] sides = {199,72,222};
        System.out.println(j.solution(sides));
    }
    public int solution(int[] sides) {
        int temp;
        for(int a=0; a<3; a++ ){
            for(int b=a+1; b<3; b++){
                if(sides[a]>sides[b]){
                    temp=sides[b];
                    sides[b]=sides[a];
                    sides[a]=temp;
                }
            }
        }
        return sides[0]+sides[1]>sides[2] ? 1 : 2;
    }
}
