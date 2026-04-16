public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);
        Quantity q2 = new Quantity(12.0, LengthUnit.INCH);
        Quantity q3 = new Quantity(2.0, LengthUnit.FEET);
        Quantity q4 = new Quantity(24.0, LengthUnit.INCH);

        System.out.println("1 ft == 12 inch: " + q1.equals(q2)); // true
        System.out.println("1 ft == 2 ft: " + q1.equals(q3));    // false
        System.out.println("12 inch == 24 inch: " + q2.equals(q4)); // false
        System.out.println("Same reference: " + q1.equals(q1));  // true
        System.out.println("Null comparison: " + q1.equals(null)); // false
    }
}