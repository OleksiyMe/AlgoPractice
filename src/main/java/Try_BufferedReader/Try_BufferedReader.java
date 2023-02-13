package Try_BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Try_BufferedReader {
    public static void main(String[] args) throws IOException {

        BufferedReader reader =
                new BufferedReader(new FileReader("src/main/java/Try_BufferedReader/fileToRead.txt"));
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\n");
        }

        String[] arr = sb.toString().split("\n");
        String anotherTry = sb.toString();
        sb = new StringBuilder();
        double lastNum = 0d;
        int counter = 0;
        for (String s : arr) {
            double root = Math.sqrt(Double.parseDouble(s));
            if (root == Math.floor(root)) {
                lastNum = Double.parseDouble(s);
            } else {
                counter++;
            }
        }
        sb.append((lastNum == 0d) ? counter : counter + "\n" + (int) lastNum);
        System.out.println(sb);
        System.out.println();
        System.out.println(deleteWholeSqrt(anotherTry));
    }

    public static String deleteWholeSqrt(String inputData) {
        int count = 0;
        int last = 0;
        String[] arr = inputData.split("\r?\n|\r");
        inputData = "";

        for (String each : arr) {
            Integer current = Integer.parseInt(each);
            double sqrt = Math.sqrt(current);
            if (sqrt == Math.floor(sqrt)) {
                last = current;
            } else {
                count++;
            }
        }
        inputData = last == 0 ? "" + count : count + "\n" + last;
        return inputData;
    }

}
