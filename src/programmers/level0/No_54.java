package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120844
//배열 회전시키기
public class No_54 {
    public static void main(String[] args) {
        No_54 j = new No_54();
        int[] numbers = {1,2,3};
        System.out.println(j.solution(numbers,"right"));
    }
    public int[] solution(int[] numbers, String direction) {
        int[] answer = numbers;
        int tmp;
        if(direction.equals("right")){
            tmp = numbers[numbers.length-1];
            for(int i=numbers.length-1; i>0; i--){
                numbers[i]=numbers[i-1];
            }
            numbers[0] = tmp;
        }
        else if(direction.equals("left")){
            tmp = numbers[0];
            for(int i=0; i<numbers.length-1; i++){
                numbers[i]=numbers[i+1];
            }
            numbers[numbers.length-1] = tmp;
        }
        return answer;
    }
}
