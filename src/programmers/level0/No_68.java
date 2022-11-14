package programmers.level0;
//https://school.programmers.co.kr/learn/courses/30/lessons/120890
//가까운 수
public class No_68 {
    public static void main(String[] args){
        No_68 j = new No_68();
        int[] array = {3,23,17};
        System.out.println(j.solution(array,20));
    }
    public int solution(int[] array, int n) {
        int answer =0;
        int[] tmp = array.clone();
        for( int i=0; i<tmp.length; i++){
            tmp[i]-=n;
            if(tmp[i]<0) tmp[i]*=-1;
        }
        for( int j=1; j<tmp.length; j++){
            if(tmp[answer]>tmp[j]) answer=j;
            else if(tmp[answer]==tmp[j]){
                answer = array[answer]>array[j] ? j : answer;
            }
        }
        return array[answer];
    }
}
