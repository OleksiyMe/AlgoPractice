package b123;
import java.util.Scanner;
public class ReverseStringGameWithDenya {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Hi there!\nEnter your word, human!\nor say STOP");
            String data = s.next();
            System.out.println("Enter reversed string!");
            String dataReversed = s.next();
            if (data.equals("STOP")||dataReversed.equals("STOP")) break;
            StringBuilder sb = new StringBuilder();
            for (int i = data.length() - 1; i >= 0; i--) {
                sb.append(data.charAt(i));
            }
            String answer = (dataReversed.equals(sb.toString()))?"Right":"Wrong";
            System.out.println("Your answer is " + answer);
        }
    }
}
