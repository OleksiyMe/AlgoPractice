package b123.hlam;

class B
{
    static void methodB()
    {
        System.out.println("Static Method Called");
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        B b = null;
        b.methodB();
    }
}