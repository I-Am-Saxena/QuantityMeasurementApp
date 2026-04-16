public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);
        Quantity q2 = new Quantity(12.0, LengthUnit.INCH);

        // Addition
        Quantity result = q1.add(q2);

        // ✅ Cleaner output
        System.out.println("Result: " + result);

        // Conversion
        System.out.println("1 ft in inches: " + q1.convertTo(LengthUnit.INCH));

        // Equality
        System.out.println("1 ft == 12 inch: " + q1.equals(q2));
    }
}