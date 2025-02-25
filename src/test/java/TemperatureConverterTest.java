import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    private TemperatureConverter tempCon;

    @BeforeEach
    void setUp() {
        tempCon = new TemperatureConverter();
    }

    @Test
    void fahrenheitToCelsius() {
        assertEquals(0, tempCon.fahrenheitToCelsius(32));
        assertEquals(100, tempCon.fahrenheitToCelsius(212));
    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(32, tempCon.celsiusToFahrenheit(0));
        assertEquals(212, tempCon.celsiusToFahrenheit(100));
    }

    @Test
    void kelvinToFahrenheit() {
        assertEquals(-460, TemperatureConverter.kelvinToFahrenheit(0));
        assertEquals(32, TemperatureConverter.kelvinToFahrenheit(273.15));
        assertEquals(212, TemperatureConverter.kelvinToFahrenheit(373.15));
    }

    @Test
    void isExtremeTemperature() {
        assertTrue(tempCon.isExtremeTemperature(-40));
        assertTrue(tempCon.isExtremeTemperature(50));
        assertFalse(tempCon.isExtremeTemperature(-39));
        assertFalse(tempCon.isExtremeTemperature(49));
    }
}