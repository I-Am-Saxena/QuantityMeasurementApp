public enum LengthUnit {

    FEET(1.0),
    INCH(1.0 / 12.0),
    CM(1.0 / 30.48),
    METER(3.28084);

    private final double toFeetFactor;

    LengthUnit(double toFeetFactor) {
        this.toFeetFactor = toFeetFactor;
    }

    public double toFeet(double value) {
        return value * toFeetFactor;
    }
}