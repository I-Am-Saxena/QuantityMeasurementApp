package test.java.com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import main.java.com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;

public class QuantityMeasurementAppTest {

    @Test
    public void givenSameFeetValues_shouldReturnTrue() {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);
        assertTrue(f1.equals(f2));
    }

    @Test
    public void givenDifferentFeetValues_shouldReturnFalse() {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(2.0);
        assertFalse(f1.equals(f2));
    }

    @Test
    public void givenNullComparison_shouldReturnFalse() {
        Feet f1 = new Feet(1.0);
        assertFalse(f1.equals(null));
    }

    @Test
    public void givenDifferentType_shouldReturnFalse() {
        Feet f1 = new Feet(1.0);
        assertFalse(f1.equals("1.0"));
    }

    @Test
    public void givenSameReference_shouldReturnTrue() {
        Feet f1 = new Feet(1.0);
        assertTrue(f1.equals(f1));
    }
}