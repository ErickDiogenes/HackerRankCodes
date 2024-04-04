/*
In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:
#Image Fluxogram IF ELSE

Task
Given an integer, "n" , perform the following conditional actions:

If "n" is odd, print Weird
If "n" is even and in the inclusive range of  to , print Not Weird
If "n" is even and in the inclusive range of  to , print Weird
If "n" is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not "n" is weird.

Input Format

A single line containing a positive integer, .

Constraints

1 <= n <= 100

Output Format:

Print Weird if the number is weird; otherwise, print Not Weird.

This is the third day codding
*/

package javaCodes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DayThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        boolean inputValido;
        do {
            try {
                number = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                inputValido = true; // Se chegou até aqui, a entrada é válida
            } catch (InputMismatchException e) {
                System.out.println("Number invalid, try again.");
                scanner.nextLine(); // Limpar o buffer do scanner
                inputValido = false; // A entrada é inválida, continuamos no loop
            }
        } while (!inputValido);

        System.out.println(isWeird(number));

        scanner.close();
    }

    private static String isWeird(int number) {
        if (number % 2 != 0) {
            return "Weird"; // N é ímpar, sempre é "Weird"
        } else {
            if (number >= 6 && number <= 20) {
                return "Weird"; // N é par e está no intervalo [6, 20], é "Weird"
            } else {
                return "Not Weird"; // N é par e não está no intervalo [6, 20], é "Not Weird"
            }
        }
    }
}
