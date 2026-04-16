public class Inches {
    private final double value;

    public Inches(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        // Same reference
        if (this == obj) return true;

        // Null and type check
        if (obj == null || getClass() != obj.getClass()) return false;

        // Cast
        Inches other = (Inches) obj;

        // Compare
        return Double.compare(this.value, other.value) == 0;
    }
}