import org.example.classes.TemperatureConverter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class TemperatureTest {

    @Test
    @DisplayName("Check that the temperature converted method works correctly.")
    void temperatureConverter_OK() {

        double t = 1;
        assertEquals(t * 9 / 5 +32, TemperatureConverter.celsiusToFahrenheit(t));
        assertEquals((t - 32) * 5 / 9, TemperatureConverter.fahrenheitToCelsius(t));
        assertEquals(t - 273, TemperatureConverter.celsiusToKelvin(t));
        assertEquals(((273.15 * t - 273.15) * 9 / 5 + 32) +32, TemperatureConverter.fahrenheitToKelvin(t));
        assertEquals(t + 273, TemperatureConverter.kelvinToCelsius(t));
        assertEquals((-457.9 * t - 32) * 5 / 9 +273.15, TemperatureConverter.kelvinToFarenheit(t));

    }
}










