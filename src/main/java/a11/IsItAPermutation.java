package a11;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsItAPermutation {
    public static void main(String[] args) {

        int[]A={1,3,4,2};
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        A[0]++;
        System.out.println(Arrays.toString(A));
        ArrayDeque<Integer>stack1=new ArrayDeque<>();
        ArrayDeque<Integer>stack2=new ArrayDeque<>();

        stack1.push(A[0]);
        for (int i = 1; stack1.size()!=A.length;) {
            if(i<A.length&&stack1.peek()>A[i]){ stack2.push(stack1.pop());continue;  }
            if(stack2.size()>0&&i>=A.length||stack2.size()>0&&stack2.peek()<A[i]){
                stack1.push(stack2.pop());continue;}
            stack1.push(A[i]);
            i++;
        }
        System.out.println(stack1);
        //Arrays.fill(A,7);

        int current=A[0];
        if (A[A.length-1]!=1) System.out.println(0);
        for(int i=1;i<A.length;i++){
            if ((current-A[i])!=1) System.out.println(0);
            current=A[i];
        }

        System.out.println(1);

    }
}
