public class QuantityMeasurementApp {
    public static void main(String[] args) {

        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);
        Feet f3 = new Feet(2.0);

        System.out.println("1.0 ft == 1.0 ft: " + f1.equals(f2)); // true
        System.out.println("1.0 ft == 2.0 ft: " + f1.equals(f3)); // false
        System.out.println("1.0 ft == null: " + f1.equals(null)); // false
        System.out.println("Same reference: " + f1.equals(f1));   // true
    }
}