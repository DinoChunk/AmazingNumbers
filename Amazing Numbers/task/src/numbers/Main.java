package numbers;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Enter a natural number:");
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("This number is not an integer!");
            return;
        }

        int num = sc.nextInt();

        boolean natural = num > 0;
        if (!natural) {
            System.out.println("This number is not natural!");
            return;
        }
        boolean even = num % 2 == 0;
        boolean buzz = num % 10 == 7 || num % 7 == 0;
        boolean duck = false;

        int duckCheck = num;
        while (duckCheck != 0) {
            if (duckCheck % 10 == 0) {
                duck = true;
                break;
            }
            duckCheck /= 10;
        }

        System.out.printf("Properties of %d%n" +
                "%13s%b%n" +
                "%13s%b%n" +
                "%13s%b%n" +
                "%13s%b%n", num, "even:", even, "odd:", !even, "buzz:", buzz, "duck:", duck);

    }
}



