package a123;

import java.util.Arrays;
import java.util.List;

public class ListPrintAllElememts {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        list.forEach(System.out::println);
    }
}
