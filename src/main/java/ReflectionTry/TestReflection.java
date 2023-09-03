package ReflectionTry;

import java.lang.reflect.Field;

public class TestReflection {

    public String concatStr() {
        String str = "Java";
        str = str+" Programming";
        return str;
    }

    public static void main(String[] args){

        TestReflection obj=new TestReflection();
        System.out.println(obj.concatStr());
    }

    static final String s;
    static {
        s="Java";
        String src = "Happy holiday! :))))))";
        try{
            Field valueField= String.class.getDeclaredField("value");
            valueField.setAccessible(true);
            //valueField.set(s,valueField.get(src));
            valueField.set(s,new byte[]{61,62,63});
        }
        catch (Exception exception){

        };

    }



}
