package a123.OracleTask;

public class Trunk {
    Trunk prev;
    String str;
    Trunk(Trunk prev, String str)
    {
        this.prev = prev;
        this.str = str;
    }
}
