package a11;

public class Test {

    public static void main(String[] args) {
        double negativeZero = -0d;
        double positiveZero = +0d;
        System.out.println( negativeZero == positiveZero );             //true
        System.out.println( negativeZero > positiveZero );              //false
        System.out.println( negativeZero < positiveZero );               //false
        System.out.println( Math.min( negativeZero, positiveZero ) );   //-0.0
        System.out.println( Math.max( negativeZero, positiveZero ) );   //0.0
        System.out.println( 1/ positiveZero );                          //Infinity
        System.out.println( 1/ negativeZero );                          //-Infinity

    }
}
