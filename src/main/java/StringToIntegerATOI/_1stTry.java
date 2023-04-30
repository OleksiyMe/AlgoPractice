package StringToIntegerATOI;

public class _1stTry {

    public static void main(String[] args) {

        String s = "-321312351235123512351235123512351235.14";
        System.out.println("The string is: " + s);
        System.out.println("The Number is: " + myAtoi(s));
    }

    private static int myAtoi(String s) {

        StringBuilder sb = new StringBuilder(s), sbTemp = new StringBuilder();
        long resultSign = 1l;
        long result = 0;

        if (s.isBlank()) return 0;
        if (!Character.isDigit(sb.charAt(0)) && sb.charAt(0) != ' ' && sb.charAt(0) != '-'
                && sb.charAt(0) != '+')
            return 0;
        while (sb.indexOf(" ") == 0) sb.delete(0, 1);

        if (sb.length() > 1 && sb.charAt(0) == '-' && Character.isDigit(sb.charAt(1))) {
            resultSign = -1l;
            sb.delete(0, 1);
        } else if (sb.length() > 1 && sb.charAt(0) == '+' && Character.isDigit(sb.charAt(1))) {
            sb.delete(0, 1);
        } else if (!Character.isDigit(sb.charAt(0))) return 0;


        while (sb.length() > 0 && Character.isDigit(sb.charAt(0))) {
            sbTemp.append(sb.charAt(0));
            sb.delete(0, 1);
        }

        if (sbTemp.length()==0) result = 0;
        else if (sbTemp.length() > 12) {
            sbTemp.delete(1, sbTemp.length() - 11);
        }
        result = Long.parseLong(sbTemp.toString());
        result *= resultSign;


        if (result < Math.pow(-2, 31)) {
            result = (long) Math.pow(-2, 31);
            return (int) result;
        }
        if (result > (Math.pow(2, 31)) - 1) {
            result = (long) (Math.pow(2, 31)) - 1;
            return (int) result;
        }

        return (int) result;
    }


}
