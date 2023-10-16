import com.conversions.TemperatureConverter;

public class TemperatureConversionMain {
    public static void main(String[] args) {
        double fahrenheit = 68.0;
        double celsius = TemperatureConverter.fahrenheitToCelsius(fahrenheit);
        double kelvin = TemperatureConverter.fahrenheitToKelvin(fahrenheit);

        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius");
        System.out.println(fahrenheit + " Fahrenheit is equal to " + kelvin + " Kelvin");

        double celsius2 = 20.0;
        double kelvin2 = TemperatureConverter.celsiusToKelvin(celsius2);

        System.out.println(celsius2 + " Celsius is equal to " + kelvin2 + " Kelvin");

        double kelvin3 = 293.15;
        double celsius3 = TemperatureConverter.kelvinToCelsius(kelvin3);
        double fahrenheit3 = TemperatureConverter.kelvinToFahrenheit(kelvin3);

        System.out.println(kelvin3 + " Kelvin is equal to " + celsius3 + " Celsius");
        System.out.println(kelvin3 + " Kelvin is equal to " + fahrenheit3 + " Fahrenheit");
    }
}

