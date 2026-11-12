import java.util.Scanner;
public class reversearrayelements{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the array size: ");
int size = sc.nextInt();
int[] numbers = new int[size];
System.out.println("Enter " + size + " numbers:");
for (int i = 0; i < size; i++) {
numbers[i] = sc.nextInt();
}
for (int left = 0, right = size - 1; left < right; left++, right--) {
int temp = numbers[left];
numbers[left] = numbers[right];
numbers[right] = temp;
}
System.out.print("Reversed array: ");
for (int number : numbers) {
System.out.print(number + " ");
}
sc.close();
}
}