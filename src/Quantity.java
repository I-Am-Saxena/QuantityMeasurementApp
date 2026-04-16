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

    public double getValue() {
        return value;
    }

    public LengthUnit getUnit() {
        return unit;
    }

    // Convert to target unit
    public Quantity convertTo(LengthUnit targetUnit) {
        double valueInFeet = unit.toFeet(value);
        double convertedValue = valueInFeet / targetUnit.toFeet(1);
        return new Quantity(convertedValue, targetUnit);
    }

    // ✅ ADDITION METHOD
    public Quantity add(Quantity other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot add null quantity");
        }

        // Convert both to base (feet)
        double sumInFeet = this.unit.toFeet(this.value) + other.unit.toFeet(other.value);

        // Return result in current object's unit
        double resultValue = sumInFeet / this.unit.toFeet(1);
        return new Quantity(resultValue, this.unit);
    }

    private double toBase() {
        return unit.toFeet(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Quantity other = (Quantity) obj;
        return Double.compare(this.toBase(), other.toBase()) == 0;
    }
}