public class Feet {
    private final double value;

    public Feet(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        // Step 1: Same reference check
        if (this == obj) return true;

        // Step 2: Null and type check
        if (obj == null || getClass() != obj.getClass()) return false;

        // Step 3: Type cast
        Feet other = (Feet) obj;

        // Step 4: Compare using Double.compare
        return Double.compare(this.value, other.value) == 0;
    }
}