import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args)
    {
        //Declaring Fahrenheit and initializing the Scanner
        double fahrenheit;
        Scanner in = new Scanner(System.in);

        //User input prompt and input itself
        System.out.println("Please input the temperature in Fahrenheit");
        fahrenheit = in.nextDouble();

        //mathematical operations for Celsius conversion, followed by C to Kelvin conversion
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        double kelvin = celsius + 273.15;

        //Output with both units of temperature
        System.out.printf("The temperature in Celsius is %.2f degrees and is %.2f in Kelvin\n", celsius, kelvin);
    }
}