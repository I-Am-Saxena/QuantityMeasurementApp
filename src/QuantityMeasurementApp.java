public class QuantityMeasurementApp {

    public static void main(String[] args) {

        try {
            Quantity q1 = new Quantity(1.0, LengthUnit.FEET);
            Quantity q2 = new Quantity(12.0, LengthUnit.INCH);

            // Valid addition
            Quantity result = q1.add(q2);
            System.out.println("Result: " + result.getValue() + " " + result.getUnit());

            // ❌ Negative value test
            Quantity invalid = new Quantity(-5.0, LengthUnit.FEET);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // ❌ Null unit test
            Quantity invalid2 = new Quantity(5.0, null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}