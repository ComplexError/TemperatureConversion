import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args)
    {
        int Fahrenheit;
        Scanner in = new Scanner(System.in);

        System.out.println("Please input the temperature in Fahrenheit");
        Fahrenheit = in.nextInt();

        double Celsius = ((Fahrenheit - 32) * (5.0 / 9.0));
        double Kelvin = (Celsius + 273.15);
        System.out.printf("The temperature in Celsius is %.2f degrees and is %.2f in Kelvin\n", Celsius, Kelvin);
    }
}