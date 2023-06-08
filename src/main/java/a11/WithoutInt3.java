package a11;

public class WithoutInt3 {
    public static void main(String[] args) {
        char ZERO_CHAR='n'-'>',
                ONE_CHAR='o'-'>',
                NINE_CHAR='w'-'>',
                currentOnes = ZERO_CHAR,
                currentTens = ZERO_CHAR,
                currentHundreds = ZERO_CHAR;
        while (true) {
            StringBuilder sb = new StringBuilder();
            if (currentOnes == NINE_CHAR) {
                currentOnes = ZERO_CHAR;
                currentTens++;
            } else currentOnes++;
            if (currentTens == NINE_CHAR) {
                currentTens = ZERO_CHAR;
                currentHundreds++;
            }

            if (currentHundreds == ZERO_CHAR && currentTens == ZERO_CHAR)
                sb.append(currentOnes);
            else if (currentHundreds == ZERO_CHAR) sb.append(currentTens).append(currentOnes);
            else sb.append(currentHundreds).append(currentTens).append(currentOnes);
            System.out.print(sb + " ");
            if (currentHundreds == ONE_CHAR) break;
        }
    }
}

