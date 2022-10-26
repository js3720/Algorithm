package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120818
//옷가게 할인 받기
public class No_39 {
    public static void main(String[] args){
        No_39 j = new No_39();
        System.out.println(j.solution(150000));
    }
    public int solution(int price) {
        return price>=500000 ? (int)(price*0.8) : price>=300000 ? (int)(price*0.9) : price>=100000 ? (int)(price*0.95) : price;
    }
}
