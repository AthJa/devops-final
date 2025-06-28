package com.devops.finalProject;
import java.util.Scanner;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
public class finalProject
{
static final Logger logger = Logger.getLogger(finalProject.class);
public static void main( String[] args )
{
BasicConfigurator.configure();
Scanner scanner = new Scanner(System.in);
boolean running = true;

while (running) {
    System.out.println("\n=== Temperature Converter ===");
    System.out.println("1. Celsius to Fahrenheit");
    System.out.println("2. Fahrenheit to Celsius");
    System.out.println("3. Celsius to Kelvin");
    System.out.println("4. Kelvin to Celsius");
    System.out.println("5. Exit");
    System.out.print("Choose an option: ");

    int choice=-1;
    try {
        choice = Integer.parseInt(scanner.nextLine());
        System.out.println(choice);
    } catch (Exception e) {
        System.out.println("Invalid input.");
        continue;
    }

    switch (choice) {
        case 1:
            System.out.print("Enter temperature in Celsius: ");
            double c1 = scanner.nextDouble();
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(c1));
            break;
        case 2:
            System.out.print("Enter temperature in Fahrenheit: ");
            double f1 = scanner.nextDouble();
            System.out.println("Celsius: " + fahrenheitToCelsius(f1));
            break;
        case 3:
            System.out.print("Enter temperature in Celsius: ");
            double c2 = scanner.nextDouble();
            System.out.println("Kelvin: " + celsiusToKelvin(c2));
            break;
        case 4:
            System.out.print("Enter temperature in Kelvin: ");
            double k1 = scanner.nextDouble();
            System.out.println("Celsius: " + kelvinToCelsius(k1));
            break;
        case 5:
            running = false;
            System.out.println("Goodbye!");
            break;
        default:
            System.out.println("Invalid choice. Try again.");
    }
}

scanner.close();
}
public static double celsiusToFahrenheit(double c) {
    return (c * 9/5) + 32;
}

public static double fahrenheitToCelsius(double f) {
    return (f - 32) * 5/9;
}

public static double celsiusToKelvin(double c) {
    return c + 273.15;
}

public static double kelvinToCelsius(double k) {
    return k - 273.15;
}
}
