package Maryna;

class UCannotSwap2VariablesInMethodInJava {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println(a+", "+b);


    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
       // System.out.println(a.getClass());
        a=b;
        b = temp;

    }
}