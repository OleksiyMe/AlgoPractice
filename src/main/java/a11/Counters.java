package a11;

import java.util.ArrayDeque;
import java.util.*;

public class Counters  {

    public static void main(String ... a){
        int [] test ={3, 4,4, 6,1,4, 4};
        int N=5;

        System.out.println(Arrays.toString(solution(N,test)));
    }

    public static int[] solution(int N, int[] A) {
        // Implement your solution here
        int [] result=new int[N];
        int max=Integer.MIN_VALUE;
        int min=0;

        for(int i=0; i<A.length;i++){
            if (A[i]<=N) {
                if (A[i]>=min){result[A[i]-1]++; }
                else result[A[i]-1]+=min+1;

                max=Math.max(max,result[A[i]-1]); }
            else{ min=max; }

        }
        for (int i=0;i< result.length;i++){
            if (result[i]<min)result[i]=min;

        }



        return result;
    }
}
