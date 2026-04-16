public class Quantity {
    private final double value;
    private final LengthUnit unit;

    public Quantity(double value, LengthUnit unit) {
        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }
        this.value = value;
        this.unit = unit;
    }

    private double toBase() {
        return unit.toFeet(value);
    }

    @Override
    public boolean equals(Object obj) {

        // Same reference
        if (this == obj) return true;

        // Null + type check
        if (obj == null || getClass() != obj.getClass()) return false;

        Quantity other = (Quantity) obj;

        // Compare after converting to same base (feet)
        return Double.compare(this.toBase(), other.toBase()) == 0;
    }
}