package EnumMethods;

public enum Calculation {

    ADD {
        public double performCalculation(double x, double y) {
            return x + y;
        }
    };

    public double calculation(double x, double y) {
        return x + y;
    }

}