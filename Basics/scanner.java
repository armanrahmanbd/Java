package Basics;

import java.util.Scanner;

public class scanner {
  public static void main(String[] args) {
    // Scanner class to take input from user
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    System.out.println("Hello, " + name + ". You are " + age + " years old.");

    scanner.close();
  }
}
