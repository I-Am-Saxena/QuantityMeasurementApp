public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Quantity q1 = new Quantity(1.0, LengthUnit.METER);
        Quantity q2 = new Quantity(100.0, LengthUnit.CM);

        // Equality check
        System.out.println("1 meter == 100 cm: " + q1.equals(q2)); // true

        // Conversion
        Quantity converted = q1.convertTo(LengthUnit.FEET);
        System.out.println("1 meter in feet: " + converted.getValue());

        // Addition
        Quantity result = q1.add(q2);
        System.out.println("1 meter + 100 cm = " + result.getValue() + " " + result.getUnit());
    }
}