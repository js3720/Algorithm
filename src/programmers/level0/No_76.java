package programmers.level0;
import java.math.BigInteger;
//https://school.programmers.co.kr/learn/courses/30/lessons/120840
//구슬을 나누는 경우의 수 (변수 자료형의 크기에 따라 오류가 날 수 있으니 주의해야 함)
public class No_76 {
    public static void main(String[] args) {
        No_76 j = new No_76();
        System.out.println(j.solution(7,2));
    }
    public long solution(int balls, int share) {
        BigInteger nP, mP, nmP ;
        nP = mP = nmP = new BigInteger("1");
        for(BigInteger idx = new BigInteger("1"); idx.intValue()<=balls; idx = idx.add(new BigInteger("1"))){
            nP = nP.multiply(idx);
        }
        for(BigInteger idx = new BigInteger("1"); idx.intValue()<=share; idx = idx.add(new BigInteger("1"))){
            mP = mP.multiply(idx);
        }
        for(BigInteger idx = new BigInteger("1"); idx.intValue()<=balls-share; idx = idx.add(new BigInteger("1"))){
            nmP = nmP.multiply(idx);
        }
        return nP.divide(nmP.multiply(mP)).longValue();
    }
}
