package EnumMethods;

public class DriverForCalculation {
    public static void main(String[] args) {
        Calculation calc=Calculation.ADD;
        System.out.println(
               Calculation.ADD.calculation (1,2)
        );
    }
}
