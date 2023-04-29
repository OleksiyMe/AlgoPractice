package interview.CityBank.javacore;

import java.util.HashMap;

public class CloneUtil {

    public static void main(String[] args) {
        DemoObj source = new DemoObj();
        source.s1 = "source";

        //i want a copy of source, which should not be affected by source any more
        DemoObj target1 = (DemoObj) clone(source);
        System.out.println(target1.s1);
        source.s1="s2";
        System.out.println(target1.s1);



    }

    public static Object clone(Object obj) {
      //  Object newObj= (Object) obj.



        return obj;


        //should return a deep copy of obj
//        Object newObject=new Object();
//        return null;
    }


    private static class DemoObj implements Cloneable {
        public String s1;
        public HashMap map1;

        public DemoObj clone(DemoObj obj) {
            DemoObj newObj = new DemoObj();
            newObj.s1 = obj.s1;
            newObj.map1 = obj.map1;
            return newObj;
        }
    }

    //shallow copy
    //deep copy / clone


}
