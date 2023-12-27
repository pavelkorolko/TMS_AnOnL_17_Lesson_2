import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //-----------------------------------------------
        System.out.println("First line before git init!");

        //-----------------------------------------------
        start();
    }

    public static void start() {
        Scanner scn = new Scanner(System.in);
        boolean flag = false;

        do {
            System.out.println("Welcome to the custom-defined calculator!");
            System.out.println("For next operations click corresponding button!");

            System.out.println("Press ----> 1 for addition");
            System.out.println("Press ----> 2 for subtraction");
            System.out.println("Press ----> 3 for multiplication");
            System.out.println("Press ----> 4 for division");
            System.out.println("Press ----> 5 to exit!");

            System.out.print("Enter operation: ");

            if (!scn.hasNextInt()) {
                System.out.println("\nIncorrect input data! Try once more!\n");
                scn.nextLine();
                flag = true;
            } else {
                int input = scn.nextInt();

                if (input == 5) {
                    System.out.println("Exiting...");
                    System.exit(0);
                }

                boolean validInput = false;

                while (!validInput) {
                    try {
                        System.out.print("Enter first num: ");
                        double num1 = scn.nextDouble();

                        System.out.print("Enter second num: ");
                        double num2 = scn.nextDouble();

                        validInput = true;

                        switch (input) {
                            case 1:
                                System.out.println("Sum: " + (num1 + num2));
                                break;
                            case 2:
                                System.out.println("Substraction: " + (num1 - num2));
                                break;
                            case 3:
                                System.out.println("Multiplication: " + (num1 * num2));
                                break;
                            case 4:
                                if (num2 == 0) {
                                    System.out.println("Can not delete on ZERO!!");
                                    System.out.println("Try once more!");
                                    validInput = false;
                                    break;
                                }
                                System.out.println("Division: " + (num1 / num2));
                                break;
                            default:
                                System.out.println("Entered number is not in range of 1-5");
                                break;
                        }

                        scn.nextLine();
                        System.out.println("Do you want continue?");
                        System.out.print("Y/N?: ");


                        if (scn.nextLine().toLowerCase().equals("y")) {
                            System.out.println("--------------------------------------------------");
                            flag = true;
                        } else {
                            System.exit(0);
                        }


                    } catch (InputMismatchException e) {
                        System.out.println("Entered num does not belong to number format!");
                        System.out.println("Try once more!");
                        scn.nextLine();
                    }
                }

            }
        } while (flag);
    }
}