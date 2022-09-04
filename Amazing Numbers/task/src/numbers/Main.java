package numbers;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Enter a natural number:");
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("This number is not natural!");
            return;
        }

        int num = sc.nextInt();
        boolean natural = num > 0;
        if (!natural) {
            System.out.println("This number is not natural!");
            return;
        }
        boolean even = num % 2 == 0;
        if (even) {
            System.out.println("This number is Even.");
        } else {
            System.out.println("This number is Odd.");
        }

        boolean buzz1 = num % 7 == 0;
        boolean buzz2 = num % 10 == 7;

        if (buzz1 || buzz2) {
            System.out.println("It is a Buzz number.");
        } else {
            System.out.println("It is not a Buzz number.");
        }

        if (buzz1 && !buzz2) {
            System.out.printf("Explanation:\n%d is divisible by 7", num);
            return;
        }
        if (buzz2 && !buzz1) {
            System.out.printf("Explanation:\n%d ends with 7", num);
            return;
        }
        if (buzz2 && buzz1) {
            System.out.printf("Explanation:\n%d is divisible by 7 and ends with 7", num);
        } else {
            System.out.printf("Explanation:\n%d is neither divisible by 7 nor does it end with 7", num);
        }
    }
}



