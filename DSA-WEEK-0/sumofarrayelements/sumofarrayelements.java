import java.util.Scanner;
public class sumofarrayelements{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the array size: ");
int size = sc.nextInt();
int[] numbers = new int[size];
int sum = 0;
System.out.println("Enter " + size + " numbers:");
for (int i = 0; i < size; i++) {
numbers[i] = sc.nextInt();
sum += numbers[i];
}
System.out.println("Sum: " + sum);
sc.close();
}
}