package programmers.level0;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/120869
//외계어 사전
public class No_78 {
    public static void main(String[] args) {
        No_78 j = new No_78();
        System.out.println(j.solution(new String[] {"z", "d", "x"}, new String[] {"def", "dww", "dzx", "loveaw"}));
    }
    public int solution(String[] spell, String[] dic) {
        int[] chCount = new int[spell.length];
        for(int i=0; i<dic.length; i++){
            Arrays.fill(chCount,0);
            int num = 0;
            for(int k=0; k<spell.length; k++){
                for(int j=0; j<dic[i].length(); j++){
                    if(dic[i].charAt(j)==spell[k].charAt(0)) chCount[k]++;
                }
                if(chCount[k]==1) num++;
            }
            if(num==spell.length)return 1;
        }
        return 2;
    }
}
