import java.util.Scanner;
class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.printf("Hello, %s! You are %d years old.", name, age);

        sc.close();
    }
}
