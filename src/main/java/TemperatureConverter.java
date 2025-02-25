public class TemperatureConverter {
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return Math.round((kelvin-273.15)* (9.0/5.0) + 32.0);
    }

    public boolean isExtremeTemperature(double temperature) {
        return temperature <= -40 || temperature >= 50;
    }
}
