package programmers.level0;
import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/120876
// 겹치는 선분의 길이
public class No_98 {
    public static void main(String[] args) {
        No_98 j = new No_98();
        int[][] Lines = {{-3, 0}, {-1, 5}, {4, 5}};
        System.out.println(j.solution(Lines));
    }
    public int solution(int[][] lines) {
        LinkedHashSet <Integer> overRap = new LinkedHashSet<>();
        List <Integer> a = new ArrayList<>();
        List <Integer> b = new ArrayList<>();
        List <Integer> c = new ArrayList<>();
        List <Integer> temp = new ArrayList<>();
        int sum = 0;
        int count = 0;
        int ovCount = 0;
        for(int i=lines[0][0]; i<=lines[0][1]; i++) a.add(i);
        for(int i=lines[1][0]; i<=lines[1][1]; i++) b.add(i);
        for(int i=lines[2][0]; i<=lines[2][1]; i++) c.add(i);
        for(int i : b.stream().mapToInt(Integer::intValue).toArray()){
            if(a.contains(i)) temp.add(i);
        }
        if(temp.size()>1) {
            for(int i : temp.stream().mapToInt(Integer::intValue).toArray()) overRap.add(i);
            sum+=temp.size();
            ovCount++;
        }
        if(temp.size()==2) count++;
        temp.clear();

        for(int i : c.stream().mapToInt(Integer::intValue).toArray()){
            if(a.contains(i)) temp.add(i);
        }
        if(temp.size()>1) {
            for(int i : temp.stream().mapToInt(Integer::intValue).toArray()) overRap.add(i);
            sum+=temp.size();
            ovCount++;
        }
        if(temp.size()==2) count++;
        temp.clear();

        for(int i : c.stream().mapToInt(Integer::intValue).toArray()){
            if(b.contains(i)) temp.add(i);
        }
        if(temp.size()>1) {
            for(int i : temp.stream().mapToInt(Integer::intValue).toArray()) overRap.add(i);
            sum+=temp.size();
            ovCount++;
        }
        if(temp.size()==2) count++;
        int over = sum-overRap.size();
        int answer = sum-over;
        temp.clear();

        if(answer!=0){
            if(count==2) return answer-count;
            else if(ovCount==2 && count==1) return answer-2;
            else return answer-1;
        }
        return 0;
    }
}
