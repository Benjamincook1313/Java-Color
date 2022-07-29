import java.util.Scanner;

class Color {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What is your favorite color?");

    String color = input.nextLine();  // Get user input
    System.out.println("Nice, I like " + color + " too");

    String name = input.nextLine();
    System.out.println("What is their name?");

    String spaceSuiteColor = input.nextLine();
    System.out.println("What color will their space suite be?");
    
    String petsName = input.nextLine();
    System.out.println("What is their pet's name?");

  }

}