package programmers.level0;


//https://school.programmers.co.kr/learn/courses/30/lessons/120804?language=java
//두 수의 곱

//실행 = ctrl + shift + f10
public class No_01 {
    public static void main(String[] args) {
        //스태틱 메서드 안에서는 그냥 메서드는 실행 못함
        //객체 생성후 메서드를 실행해야함
        No_01 name = new No_01();
        System.out.println(name.solution(3,4));
    }
    public int solution(int num1, int num2) {
        return num1*num2;
    }
}
