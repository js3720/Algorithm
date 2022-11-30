package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120924
//다음에 올 숫자
public class No_92 {
    public static void main(String[] args) {
        No_92 j = new No_92();
        System.out.println(j.solution(new int[] {1,2,3,4}));
    }
    public int solution(int[] common) {
        return common[1]-common[0]==common[2]-common[1] ?
                common[common.length-1]+common[2]-common[1] :
                common[1]/common[0]==common[2]/common[1] ?
                common[common.length-1]*common[2]/common[1] : 0 ;
    }
}
