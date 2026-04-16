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