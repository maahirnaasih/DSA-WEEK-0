import java.util.Scanner;

public class sumofdigitsatevenpositions{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Math.abs(input.nextInt());
        int position = 1;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;

            if (position % 2 == 0) {
                sum += digit;
            }

            number /= 10;
            position++;
        }

        System.out.println("Sum of digits at even positions: " + sum);
        input.close();
    }
}