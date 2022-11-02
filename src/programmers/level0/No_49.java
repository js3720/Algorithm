package programmers.level0;
import java.util.Scanner;
//https://school.programmers.co.kr/learn/courses/30/lessons/120823
//직각삼각형 출력하기
public class No_49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String enswer ="";
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            enswer +="*";
            System.out.println(enswer);
        }
    }
}
