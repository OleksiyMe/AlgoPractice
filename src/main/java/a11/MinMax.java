package a11;

public class MinMax {

    public static void main(String[] args) {

        int[] input={1,34,45,67,-9,100};

        int min=Integer.MAX_VALUE;

        for (int i = 0;  i <input.length ; i++) {
            min=Math.min(input[i],min);
            //if (input[i]<min) min=input[i];

        }
        System.out.println(min);


    }
}
