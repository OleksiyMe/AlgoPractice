package excelSheetColumnNumber;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {

        String given  = "ZY";
        System.out.println(excelToInt(given));

    }

    private static int excelToInt(String given) {
        int result=0, i=given.length()-1;

        for (char ch : given.toCharArray()) {
            result += (ch-64)*Math.pow(26,i);
            --i;
        }



        return result;


    }
}
