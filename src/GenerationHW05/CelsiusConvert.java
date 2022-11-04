package GenerationHW05;

import java.util.Scanner;

public class CelsiusConvert {
    public static void main(String[] args) {
        double Cels;
        double Far;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Celsius temperature - ");
        Cels = scanner.nextDouble();
        Far = 9*Cels/5+32;
        System.out.print("Fahrenheit temperature is = ");
        System.out.print(String.format("%.2f", Far));

    }
}
