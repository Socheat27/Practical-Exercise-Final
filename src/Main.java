import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Input the numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("\nEntered numbers:");
        for (int i = 0; i < n; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
    }
}
