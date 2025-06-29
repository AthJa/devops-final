package com.devops.finalProject;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class finalProject {
    static final Logger logger = Logger.getLogger(finalProject.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        if (args.length == 0 || args.length % 2 != 0) {
            System.out.println("Usage: <option1> <value1> <option2> <value2> ...");
            System.out.println("Options:");
            System.out.println("1 = Celsius to Fahrenheit");
            System.out.println("2 = Fahrenheit to Celsius");
            System.out.println("3 = Celsius to Kelvin");
            System.out.println("4 = Kelvin to Celsius");
            System.out.println("5 = Exit");
            return;
        }

        for (int i = 0; i < args.length; i += 2) {
            int choice;
            try {
                choice = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid option: " + args[i]);
                continue;
            }

            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }

            double inputValue;
            try {
                inputValue = Double.parseDouble(args[i + 1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + args[i + 1]);
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println(inputValue + "°C = " + celsiusToFahrenheit(inputValue) + "°F");
                    break;
                case 2:
                    System.out.println(inputValue + "°F = " + fahrenheitToCelsius(inputValue) + "°C");
                    break;
                case 3:
                    System.out.println(inputValue + "°C = " + celsiusToKelvin(inputValue) + "K");
                    break;
                case 4:
                    System.out.println(inputValue + "K = " + kelvinToCelsius(inputValue) + "°C");
                    break;
                default:
                    System.out.println("Invalid choice: " + choice);
            }
        }
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double c) {
        return c + 273.15;
    }

    public static double kelvinToCelsius(double k) {
        return k - 273.15;
    }
}
