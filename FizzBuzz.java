import java.util.Scanner;

public class FizzBuzz {


  public static void fizzbuzzCheck(int num) {
    for (int i = 0; i <= num; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println(i + " - FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println(i + " - Fizz");
      } else if (i % 5 == 0) {
        System.out.println(i + " - Buzz");
      } else {
        System.out.println(i);
      }
    }
  }

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter a number you want to check until: ");
    int checkUntil = userInput.nextInt();
    System.out.println("Calculating...");
    fizzbuzzCheck(checkUntil);

  }
}
