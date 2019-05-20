/**
 * Arithmetic Practice Program
 * The objective of this project is to write decision statements and loops.
 * This is a program for practicing arithmetic skills.
 * This program prompts the user to choose between 5 different arithmetic practice.
 * After choosing an option, the program will prompt the user to do 5 problems.
 * Then after the user answers, it will tell the user if it was correct or incorrect.
 * It will also give the solution to the problem if the user's answer was incorrect.
 * Then if the user may choose a different arithmetic practice, but if they choose
 * option 6 then the program will output the total correct and the total problems attempted
 * with a percentage correct. Then the program will exit.
 */
package arithmetic_practice;

import java.util.Scanner;

public class ArithmeticPracticeProgram {

    public static void main(String[] args) {
        //Initialize variables 
        Scanner input = new Scanner(System.in);
        int choice = 0;
        double totalQuestions = 0;
        double correctAnswers = 0;

        System.out.println("Welcome!");

        //If the users input for "choice" is 6, then this loop won't run again
        while (choice != 6) {
            //Prints out the options for the users
            System.out.println("");
            System.out.println("Please choose one of the following options for your math quiz:");
            System.out.println("1. Addition with numbers 1­10");
            System.out.println("2. Addition with numbers 1­100");
            System.out.println("3. Subtraction with numbers 1­10");
            System.out.println("4. Subtraction with numbers 1­100 ");
            System.out.println("5. Multiplication with numbers 1­10 ");
            System.out.println("6. Exit the program");
            System.out.println("");

            //The user will input a number between 1-6 to choose the options
            choice = input.nextInt();

            //This is a check to see if the user's input is an available option
            //If the user chooses a number other than 1-6, the program will prompt
            //the user to re-enter their choice
            if (choice > 6 || choice < 1) {
                while (choice > 6 || choice < 1) {
                    System.out.println("Valid choices are 1-6; please re-enter");
                    choice = input.nextInt();
                }
            }
            //If the user inputs 1 for the variable "choice", then the program 
            //prints out 5 addition problems with numbers 1-10
            if (choice == 1) {
                //this for loop will run 5 times, causing 5 questions to be printed
                for (int i = 0; i < 5; i++) {
                    //Generates random numbers for the problem
                    int number1 = (int) (1 + Math.random() * 10);
                    int number2 = (int) (1 + Math.random() * 10);
                    //Determines the sum for the 2 random numbers
                    int sum = number1 + number2;
                    //Prints out the problem for the user to answer
                    System.out.println("");
                    System.out.printf("Enter the answer to the following problem: %d + %d\n", number1, number2);
                    //This variable keeps track of how many questions were printed out by adding 1 to the variable each time
                    totalQuestions++;
                    int answer = input.nextInt();
                    //If the user input answer is equal to the sum then it outputs "That is the correct answer!"
                    if (answer == sum) {
                        System.out.println("That is the correct answer!");
                        //This variable keeps track of how many questions were answered correctly
                        correctAnswers++;
                      // If the answer does not equal the sum then it outputs "Sorry, that is incorrect" and outputs the correct answer
                    } else if (answer != sum) {
                        System.out.printf("Sorry, that is incorrect. The correct answer is %d\n", sum);
                    }
                }
            }

            //If the user inputs 2 for the variable "choice", then the program 
            //prints out 5 addition problems with numbers 1-100
            if (choice == 2) {
                //this for loop will run 5 times, causing 5 questions to be printed
                for (int i = 0; i < 5; i++) {
                    //Generates random numbers for the problem
                    int number1 = (int) (1 + Math.random() * 100);
                    int number2 = (int) (1 + Math.random() * 100);
                    //Determines the sum for the 2 random numbers
                    int sum = number1 + number2;
                    //Prints out the problem for the user to answer
                    System.out.println("");
                    System.out.printf("Enter the answer to the following problem: %d + %d\n", number1, number2);
                    //Keeps track the of total amount of questions printed out
                    totalQuestions++;
                    int answer = input.nextInt();
                    //If the user input answer is equal to the sum then it outputs "That is the correct answer!"
                    if (answer == sum) {
                        System.out.println("That is the correct answer!");
                        //Keeps track of the total amount of correctly answered questions
                        correctAnswers++;
                      // If the answer does not equal the sum then it outputs "Sorry, that is incorrect" and outputs the correct answer
                    } else if (answer != sum) {
                        System.out.printf("Sorry, that is incorrect. The correct answer is %d\n", sum);
                    }
                }

            }

            //If the user inputs 3 for the variable "choice", then the program 
            //prints out 5 subtraction problems with numbers 1-10
            if (choice == 3) {
                //this for loop will run 5 times, causing 5 questions to be printed
                for (int i = 0; i < 5; i++) {
                    //Generates random numbers for the problem
                    int number1 = (int) (1 + Math.random() * 10);
                    int number2 = (int) (1 + Math.random() * 10);
                    //This if statement makes sure that the first number being subracted
                    //is not smaller than the second number. This makes sure that
                    //there are no negative answers for the difference between the two numbers
                    if (number1 < number2) {
                        int temporary = number1;
                        number1 = number2;
                        number2 = temporary;
                    }
                    //Determines the difference for the 2 random numbers
                    int difference = number1 - number2;
                    //Prints out the problem for the user to answer
                    System.out.println("");
                    System.out.printf("Enter the answer to the following problem: %d - %d\n", number1, number2);
                    //Keeps track the of total amount of questions printed out
                    totalQuestions++;
                    int answer = input.nextInt();
                    //If the user input answer is equal to the difference then it outputs "That is the correct answer!"
                    if (answer == difference) {
                        System.out.println("That is the correct answer!");
                        //Keeps track of the total amount of correctly answered questions
                        correctAnswers++;
                      // If the answer does not equal the difference then it outputs "Sorry, that is incorrect" and outputs the correct answer
                    } else if (answer != difference) {
                        System.out.printf("Sorry, that is incorrect. The correct answer is %d\n", difference);
                    }

                }
            }

            //If the user inputs 4 for the variable "choice", then the program 
            //prints out 5 subtraction problems with numbers 1-100
            if (choice == 4) {
                //this for loop will run 5 times, causing 5 questions to be printed
                for (int i = 0; i < 5; i++) {
                    //Generates random numbers for the problem
                    int number1 = (int) (1 + Math.random() * 100);
                    int number2 = (int) (1 + Math.random() * 100);
                    //This if statement makes sure there are no negative answers for the difference 
                    //of the 2 randmon numbers
                    if (number1 < number2) {
                        int temporary = number1;
                        number1 = number2;
                        number2 = temporary;
                    }
                    //Determines the difference for the 2 random numbers
                    int difference = number1 - number2;
                    //Prints out the problem for the user to answer
                    System.out.println("");
                    System.out.printf("Enter the answer to the following problem: %d - %d\n", number1, number2);
                    //Keeps track the of total amount of questions printed out
                    totalQuestions++;
                    int answer = input.nextInt();
                    //If the user input answer is equal to the difference then it outputs "That is the correct answer!"
                    if (answer == difference) {
                        System.out.println("That is the correct answer!");
                        //Keeps track of the total amount of correctly answered questions
                        correctAnswers++;
                      // If the answer does not equal the difference then it outputs "Sorry, that is incorrect" and outputs the correct answer
                    } else if (answer != difference) {
                        System.out.printf("Sorry, that is incorrect. The correct answer is %d\n", difference);
                    }

                }

            }

            //If the user inputs 5 for the variable "choice", then the program 
            //prints out 5 multiplication problems with numbers 1-10
            if (choice == 5) {
                //this for loop will run 5 times, causing 5 questions to be printed
                for (int i = 0; i < 5; i++) {
                    //Generates random numbers for the problem
                    int number1 = (int) (1 + Math.random() * 10);
                    int number2 = (int) (1 + Math.random() * 10);
                    //Determines the product for the 2 random numbers
                    int product = number1 * number2;
                    //Prints out the problem for the user to answer
                    System.out.println("");
                    System.out.printf("Enter the answer to the following problem: %d * %d\n", number1, number2);
                    //Keeps track the of total amount of questions printed out
                    totalQuestions++;
                    int answer = input.nextInt();
                    //If the user input answer is equal to the product then it outputs "That is the correct answer!"
                    if (answer == product) {
                        System.out.println("That is the correct answer!");
                        //Keeps track of the total amount of correctly answered questions
                        correctAnswers++;
                      // If the answer does not equal the product then it outputs "Sorry, that is incorrect" and outputs the correct answer
                    } else if (answer != product) {
                        System.out.printf("Sorry, that is incorrect. The correct answer is %d\n", product);
                    }
                }

            }

            //If the user inputs 6, the program will print out the total correct and 
            //the total problems attempted. With a percentage correct. Then
            //the program will end.
            if (choice == 6) {
                //This calculates the percentage correct
                double percentage = correctAnswers / totalQuestions * 100;
                //Prints out problem correct, problems attempted, and percentage correct
                System.out.println("");
                System.out.printf("You got %.0f problems correct out of %.0f problems attempted. ", correctAnswers, totalQuestions);
                System.out.printf("That is %.2f percent correct. Goodbye!", percentage);

            }

        }
        input.close();
    }

}
