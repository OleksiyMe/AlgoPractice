package a11;

public class WithoutInt2 {
    public static void main(String[] args) {
        char ZERO_CHAR='n'-'>',
                ONE_CHAR='o'-'>',
                NINE_CHAR='w'-'>',
                currentOnes = ZERO_CHAR,
                currentTens = ZERO_CHAR,
                currentHundreds = ZERO_CHAR;
        while (true) {
            if (currentOnes == NINE_CHAR) {
                currentOnes = ZERO_CHAR;
                currentTens++;
            } else currentOnes++;
            if (currentTens == NINE_CHAR) {
                currentTens = ZERO_CHAR;
                currentHundreds++;
            }

            if (currentHundreds == ZERO_CHAR && currentTens == ZERO_CHAR)
                System.out.print(currentOnes+" ");
            else if (currentHundreds == ZERO_CHAR)
                System.out.print(currentTens+""+currentOnes+" ");
            else  System.out.print(currentHundreds+""+currentTens+""+currentOnes+" ");
            if (currentHundreds == ONE_CHAR) break;
        }
    }
}

