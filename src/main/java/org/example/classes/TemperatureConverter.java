package org.example.classes;

public class TemperatureConverter {
           public static double fahrenheitToCelsius(double fahrenheit) {

            double celsius;
            celsius = (fahrenheit - 32) / 1.8;
            System.out.println("Temperature in celsius:" + celsius);
            return celsius;
        }

        public static double fahrenheitToKelvin(double fahrenheit) {

            double kelvin;
            kelvin = ((273.15 * fahrenheit - 273.15) * 9 / 5 + 32) +32;
            System.out.println("Temperature in kelvin:" + kelvin);
            return kelvin;
        }

        public static double celsiusToFahrenheit(double celsius) {

            double fahrenheit;
            fahrenheit = celsius * 9 / 5 +32;
            System.out.println("Temperature in fahrenheit:" + fahrenheit);
            return fahrenheit;
        }

        public static double celsiusToKelvin(double celsius) {

            double kelvin;
            kelvin = celsius - 273;
            System.out.println("Temperature in kelvin:" + kelvin);
            return kelvin;
        }

        public static double kelvinToFarenheit(double kelvin) {

            double fahrenheit;
            fahrenheit = (-457.9 * kelvin - 32) * 5 / 9 +273.15;
            System.out.println("Temperature in fahrenheit:" + fahrenheit);
            return fahrenheit;
        }

        public static double kelvinToCelsius(double kelvin) {

            double celsius;
            celsius = kelvin + 273;
            System.out.println("Temperature in celsius:" + celsius);
            return celsius;
        }

    }











