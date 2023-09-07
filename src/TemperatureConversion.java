import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args)
    {
        int FTemp;
        Scanner in = new Scanner(System.in);

        System.out.println("Please input the temperature in Fahrenheit");

        FTemp = in.nextInt();
        double CalcCelsius = ((FTemp - 32) * (5.0 / 9.0));
        System.out.println(CalcCelsius);
    }
}