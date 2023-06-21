package a11;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AllSubstrings implements Cloneable{

    public int temp;

    public static void main(String[] args) throws CloneNotSupportedException {

        String input = "ABSDEFG";

        substrings(input);

        AllSubstrings ob1=new AllSubstrings();
        ob1.temp=1001124;
        AllSubstrings obj2= ob1.clone();

        System.out.println("obj1 equals obj2 "+ob1.equals(obj2));
        System.out.println("obj1 hashcode "+ob1.hashCode());
        System.out.println("obj2 hashcode "+obj2.hashCode());
        System.out.println(obj2.temp);
        AllSubstrings obj3=obj2.clone();
        System.out.println(obj3.temp);
//        Constructor<AllSubstrings> constructor=AllSubstrings.class.getConstructor();
//        AllSubstrings allSubstrings=constructor.newInstance();

    }
    public AllSubstrings clone() throws CloneNotSupportedException{
        return (AllSubstrings) super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof AllSubstrings)) return false;
        if (this.temp==((AllSubstrings)obj).temp)return true;
        else return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(temp,temp);
    }

    private static void substrings(String input) {

        int  maxLength = input.length(), currentLength = 1;
        ExecutorService exec = Executors.newCachedThreadPool();
     //   ExecutorService exec1 = Executors.newFixedThreadPool(2);
        while (currentLength <= maxLength) {
            final int current = currentLength;
            exec.execute(() -> {
                for (int i = 0; i < maxLength; i++) {
                    if ((i + current) <= maxLength) System.out.println(input.substring(i, i + current));
                    //else System.out.println(input.substring(i));
                }
            });
            currentLength++;

        }
        exec.shutdown();
        while (!exec.isTerminated()) {
        }

    }
}
