import java.util.Scanner;

public class ConvertDecimaltoHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        String hexadecimal = convertDecimalToHexadecimal(decimalNumber);
        System.out.println("The hexadecimal representation is: " + hexadecimal.toUpperCase());
    }

    public static String convertDecimalToHexadecimal(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }
}
