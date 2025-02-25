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

    public static void main(String[] args) {
        TemperatureConverter tempCon = new TemperatureConverter();
        System.out.println(tempCon.fahrenheitToCelsius(32));
        System.out.println(tempCon.fahrenheitToCelsius(212));
        System.out.println(tempCon.celsiusToFahrenheit(0));
        System.out.println(tempCon.celsiusToFahrenheit(100));
        System.out.println(TemperatureConverter.kelvinToFahrenheit(0));
        System.out.println(TemperatureConverter.kelvinToFahrenheit(273.15));
        System.out.println(TemperatureConverter.kelvinToFahrenheit(373.15));
        System.out.println(tempCon.isExtremeTemperature(-40));
        System.out.println(tempCon.isExtremeTemperature(50));
        System.out.println(tempCon.isExtremeTemperature(-39));
        System.out.println(tempCon.isExtremeTemperature(49));
    }
}
