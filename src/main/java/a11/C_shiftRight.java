package a11;

import java.util.Arrays;

public class C_shiftRight {

    public static void main(String[] args) {

        int [] A = {1,6,2,3,4,7};
        System.out.println(Arrays.toString(A));
        A=shiftRight(A);
        System.out.println(Arrays.toString(A));

        //Arrays.stream(A).distinct().collect(Collectors.toList());

//        int num=0;
//        num=num++;
//        num=num++;
//        num=++num;
//        int a = num;
//        System.out.println("a = " + a);
//        System.out.println("num = " + num);

    }

    public static int[] shiftRight(int[] B){

        int tempLast=B[B.length-1];;
        int tempCurrent=B[0];
        int tempNext=B[1];
        for (int i=0;i<B.length-1;i++){
            tempNext=B[i+1];
            B[i+1]=tempCurrent;
           tempCurrent=tempNext;

           if (i==0) B[i]=tempLast;

        }


        return B;
    }

}
