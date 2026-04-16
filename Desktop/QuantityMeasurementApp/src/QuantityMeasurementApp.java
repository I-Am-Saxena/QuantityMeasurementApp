public class QuantityMeasurementApp {

    // Feet equality method
    public static boolean areFeetEqual(double v1, double v2) {
        Feet f1 = new Feet(v1);
        Feet f2 = new Feet(v2);
        return f1.equals(f2);
    }

    // Inches equality method
    public static boolean areInchesEqual(double v1, double v2) {
        Inches i1 = new Inches(v1);
        Inches i2 = new Inches(v2);
        return i1.equals(i2);
    }

    public static void main(String[] args) {

        // Feet tests
        System.out.println("Feet 1.0 == 1.0: " + areFeetEqual(1.0, 1.0)); // true
        System.out.println("Feet 1.0 == 2.0: " + areFeetEqual(1.0, 2.0)); // false

        // Inches tests
        System.out.println("Inches 1.0 == 1.0: " + areInchesEqual(1.0, 1.0)); // true
        System.out.println("Inches 1.0 == 2.0: " + areInchesEqual(1.0, 2.0)); // false
    }
}