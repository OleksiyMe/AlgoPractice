package a11;

import java.util.Arrays;

public class Test3Clone implements Cloneable {

    int a;
    String string;
    int[] array;

    public Test3Clone() {
        this.a = 10;
        this.string = "Hello";
        this.array = new int[]{1, 2, 3, 4};
    }

    @Override
    public Test3Clone clone()  {

        try {
            Test3Clone newObject = (Test3Clone) super.clone();
            newObject.array=this.array.clone();
            return newObject;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Test3Clone shallowClone()  {

        try {
            Test3Clone newObject = (Test3Clone) super.clone();
            return newObject;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }



    public static void main(String[] args) {
        Test3Clone firstObj=new Test3Clone();
        Test3Clone secondObj=firstObj.clone();
        secondObj.array[1]=100;
        System.out.println("Deep clone, change element of array, compare objects: "+
                Arrays.equals( firstObj.array, secondObj.array));

        Test3Clone thirdObject = new Test3Clone();
        Test3Clone fourthObject = thirdObject.shallowClone();
        fourthObject.array[0]=100;
        System.out.println("Clone, change element of array, compare objects: "+
                Arrays.equals( thirdObject.array, fourthObject.array));





    }


}
