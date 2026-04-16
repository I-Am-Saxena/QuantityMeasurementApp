public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);

        // Convert 1 foot → inches
        Quantity result = q1.convertTo(LengthUnit.INCH);

        System.out.println("1 ft in inches: " + result.getValue());

        // Verify conversion using equality
        Quantity q2 = new Quantity(12.0, LengthUnit.INCH);
        System.out.println("1 ft == 12 inch: " + q1.equals(q2)); // true
    }
}