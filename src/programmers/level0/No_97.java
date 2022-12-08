package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120866
//안전지대
public class No_97 {
    public static void main(String[] args) {
        No_97 j = new No_97();
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        System.out.println(j.solution(board));
    }
    public int solution(int[][] board) {
        int count=0;
        for(int i=0; i< board.length; i++){
            for(int j=0; j< board.length; j++){
                if(board[i][j]==1){
                    for(int k=i-1; k<=i+1; k++){
                        for(int f=j-1; f<=j+1; f++){
                            if(k>=0 && k<board.length && f>=0 && f<board.length && board[k][f]==0) board[k][f]=2;
                        }
                    }
                }
            }
        }
        for(int i=0; i< board.length; i++){
            for(int j=0; j< board.length; j++){
                if(board[i][j]==1 || board[i][j]==2) count++;
            }
        }
        return (board.length * board.length)- count;
    }
}
