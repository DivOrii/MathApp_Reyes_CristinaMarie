import java.util.Scanner;

public class MathApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;

        // Challenge 1 that stores history list up to 10.
        String[] history = new String[10];
        int historyCount = 0;

        do {
            System.out.println("=== Math App Menu ===");
            System.out.println();
            System.out.println("1. Addition of two numbers");
            System.out.println("2. Subtraction of two numbers");
            System.out.println("3. Multiplication of two numbers");
            System.out.println("4. Division of two numbers");
            System.out.println("5. Factorial of a number");
            System.out.println("6. Power (x^y)");
            System.out.println("7. Sum of numbers 1 to N");
            System.out.println("8. Check if a number is prime");
            System.out.println("9. Greatest Common Divisor (GCD)");
            System.out.println("10. Absolute value of a number");
            System.out.println("11. Average of N numbers");
            System.out.println("12. Maximum of N numbers");
            System.out.println("13. History");
            System.out.println("0. Exit");

            // The challange 2, if the user might type in a letter.
            System.out.print("Enter your choice: ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
                System.out.print("Enter your choice: ");
            }
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    /* Addition */
                    System.out.print("Enter first number: ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                        System.out.print("Enter first number: ");
                    }

                    double add1 = input.nextDouble();

                    System.out.print("Enter second number: ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                        System.out.print("Enter second number: ");
                    }

                    double add2 = input.nextDouble();

                    double sum = add1 + add2;

                    System.out.println("Result: " + sum);

                    /* Save result to history */
                    String result1 = "Addition: " + add1 + " + " + add2 + " = " + sum;

                    if (historyCount < 10) {
                        history[historyCount] = result1;
                        historyCount++;
                    } else {
                        for (int i = 0; i < 9; i++) {
                            history[i] = history[i + 1];
                        }
                        history[9] = result1;
                    }

                    break;

                case 2:
                    /* Subtraction */
                    System.out.print("Enter first number: ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                        System.out.print("Enter first number: ");
                    }

                    double sub1 = input.nextDouble();

                    System.out.print("Enter second number: ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                        System.out.print("Enter second number: ");
                    }

                    double sub2 = input.nextDouble();

                    double difference = sub1 - sub2;

                    System.out.println("Result: " + difference);

                    String result2 = "Subtraction: " + sub1 + " - " + sub2 + " = " + difference;

                    if (historyCount < 10) {
                        history[historyCount] = result2;
                        historyCount++;
                    } else {
                        for (int i = 0; i < 9; i++) {
                            history[i] = history[i + 1];
                        }
                        history[9] = result2;
                    }

                    break;

                case 3:
                    /* Multiplication */
                    System.out.print("Enter first number: ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                        System.out.print("Enter first number: ");
                    }

                    double mul1 = input.nextDouble();

                    System.out.print("Enter second number: ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                        System.out.print("Enter second number: ");
                    }

                    double mul2 = input.nextDouble();

                    double product = mul1 * mul2;

                    System.out.println("Result: " + product);

                    String result3 = "Multiplication: " + mul1 + " * " + mul2 + " = " + product;

                    if (historyCount < 10) {
                        history[historyCount] = result3;
                        historyCount++;
                    } else {
                        for (int i = 0; i < 9; i++) {
                            history[i] = history[i + 1];
                        }
                        history[9] = result3;
                    }

                    break;

                case 4:
                    /* Division */
                    System.out.print("Enter first number: ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                        System.out.print("Enter first number: ");
                    }

                    double div1 = input.nextDouble();

                    System.out.print("Enter second number: ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                        System.out.print("Enter second number: ");
                    }

                    double div2 = input.nextDouble();

                    /* Check for division by zero */
                    if (div2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        double quotient = div1 / div2;

                        System.out.println("Result: " + quotient);

                        String result4 = "Division: " + div1 + " / " + div2 + " = " + quotient;

                        if (historyCount < 10) {
                            history[historyCount] = result4;
                            historyCount++;
                        } else {
                            for (int i = 0; i < 9; i++) {
                                history[i] = history[i + 1];
                            }
                            history[9] = result4;
                        }
                    }
                    break;

                case 5:
                    /* Factorial */
                    System.out.print("Enter a number: ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a whole number.");
                        input.next();
                        System.out.print("Enter a number: ");
                    }

                    int n = input.nextInt();

                    /* Factorial cannot use negative numbers */
                    if (n < 0) {
                        System.out.println("Error: Factorial cannot be negative.");
                    } else {
                        long factorial = 1;

                        for (int i = 1; i <= n; i++) {
                            factorial = factorial * i;
                        }

                        System.out.println("Result: " + factorial);

                        String result5 = "Factorial: " + n + "! = " + factorial;

                        if (historyCount < 10) {
                            history[historyCount] = result5;
                            historyCount++;
                        } else {
                            for (int i = 0; i < 9; i++) {
                                history[i] = history[i + 1];
                            }
                            history[9] = result5;
                        }
                    }
                    break;

                case 6:
                    /* Power */
                    System.out.print("Enter the base (x): ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                        System.out.print("Enter the base (x): ");
                    }

                    double base = input.nextDouble();

                    System.out.print("Enter the exponent (y): ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                        System.out.print("Enter the exponent (y): ");
                    }

                    double exponent = input.nextDouble();

                    double power = Math.pow(base, exponent);

                    System.out.println("Result: " + power);

                    String result6 = "Power: " + base + "^" + exponent + " = " + power;

                    if (historyCount < 10) {
                        history[historyCount] = result6;
                        historyCount++;
                    } else {
                        for (int i = 0; i < 9; i++) {
                            history[i] = history[i + 1];
                        }
                        history[9] = result6;
                    }

                    break;

                case 7:
                    /* Sum 1 to N */
                    System.out.print("Enter N: ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a whole number.");
                        input.next();
                        System.out.print("Enter N: ");
                    }

                    int limit = input.nextInt();

                    if (limit < 1) {
                        System.out.println("Error: N must be at least 1.");
                    } else {
                        int total = 0;

                        for (int i = 1; i <= limit; i++) {
                            total = total + i;
                        }

                        System.out.println("Result: " + total);

                        String result7 = "Sum 1 to " + limit + " = " + total;

                        if (historyCount < 10) {
                            history[historyCount] = result7;
                            historyCount++;
                        } else {
                            for (int i = 0; i < 9; i++) {
                                history[i] = history[i + 1];
                            }
                            history[9] = result7;
                        }
                    }
                    break;

                case 8:
                    /* Prime checker */
                    System.out.print("Enter a number: ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a whole number.");
                        input.next();
                        System.out.print("Enter a number: ");
                    }

                    int primeNumber = input.nextInt();

                    boolean isPrime = true;

                    /* Numbers below 2 are not prime */
                    if (primeNumber < 2) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i < primeNumber; i++) {
                            if (primeNumber % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }

                    if (isPrime) {
                        System.out.println(primeNumber + " is a prime number.");
                    } else {
                        System.out.println(primeNumber + " is not a prime number.");
                    }

                    String result8;

                    if (isPrime) {
                        result8 = primeNumber + " is prime";
                    } else {
                        result8 = primeNumber + " is not prime";
                    }

                    if (historyCount < 10) {
                        history[historyCount] = result8;
                        historyCount++;
                    } else {
                        for (int i = 0; i < 9; i++) {
                            history[i] = history[i + 1];
                        }
                        history[9] = result8;
                    }
                    break;

                case 9:
                    /* GCD */
                    System.out.print("Enter first number: ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a whole number.");
                        input.next();
                        System.out.print("Enter first number: ");
                    }

                    int num1 = input.nextInt();

                    System.out.print("Enter second number: ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a whole number.");
                        input.next();
                        System.out.print("Enter second number: ");
                    }

                    int num2 = input.nextInt();

                    num1 = Math.abs(num1);
                    num2 = Math.abs(num2);

                    int originalNum1 = num1;
                    int originalNum2 = num2;

                    /* Euclidean algorithm */
                    while (num2 != 0) {
                        int remainder = num1 % num2;
                        num1 = num2;
                        num2 = remainder;
                    }

                    System.out.println("GCD: " + num1);

                    String result9 = "GCD of " + originalNum1 + " and "
                            + originalNum2 + " = " + num1;

                    if (historyCount < 10) {
                        history[historyCount] = result9;
                        historyCount++;
                    } else {
                        for (int i = 0; i < 9; i++) {
                            history[i] = history[i + 1];
                        }
                        history[9] = result9;
                    }

                    break;

                case 10:
                    /* Absolute value */
                    System.out.print("Enter a number: ");

                    while (!input.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        input.next();
                        System.out.print("Enter a number: ");
                    }

                    double absoluteNumber = input.nextDouble();

                    double absoluteValue = Math.abs(absoluteNumber);

                    System.out.println("Absolute value: " + absoluteValue);

                    String result10 = "Absolute value of "
                            + absoluteNumber + " = " + absoluteValue;

                    if (historyCount < 10) {
                        history[historyCount] = result10;
                        historyCount++;
                    } else {
                        for (int i = 0; i < 9; i++) {
                            history[i] = history[i + 1];
                        }
                        history[9] = result10;
                    }
                    break;

                case 11:
                    /* Average using array */
                    System.out.print("How many numbers? ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a whole number.");
                        input.next();
                        System.out.print("How many numbers? ");
                    }

                    int count = input.nextInt();

                    if (count <= 0) {
                        System.out.println("Error: Number of values must be greater than 0.");
                    } else {
                        double[] numbers = new double[count];
                        double totalAverage = 0;

                        for (int i = 0; i < count; i++) {
                            System.out.print("Enter number " + (i + 1) + ": ");

                            while (!input.hasNextDouble()) {
                                System.out.println("Invalid input. Please enter a number.");
                                input.next();
                                System.out.print("Enter number " + (i + 1) + ": ");
                            }

                            numbers[i] = input.nextDouble();
                            totalAverage = totalAverage + numbers[i];
                        }

                        double average = totalAverage / count;

                        System.out.println("Average: " + average);

                        String result11 = "Average = " + average;

                        if (historyCount < 10) {
                            history[historyCount] = result11;
                            historyCount++;
                        } else {
                            for (int i = 0; i < 9; i++) {
                                history[i] = history[i + 1];
                            }
                            history[9] = result11;
                        }
                    }

                    break;

                case 12:
                    /* Maximum using array */
                    System.out.print("How many numbers? ");

                    while (!input.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a whole number.");
                        input.next();
                        System.out.print("How many numbers? ");
                    }

                    int maxCount = input.nextInt();

                    if (maxCount <= 0) {
                        System.out.println("Error: Number of values must be greater than 0.");
                    } else {
                        double[] values = new double[maxCount];

                        System.out.print("Enter number 1: ");

                        while (!input.hasNextDouble()) {
                            System.out.println("Invalid input. Please enter a number.");
                            input.next();
                            System.out.print("Enter number 1: ");
                        }

                        values[0] = input.nextDouble();

                        double maximum = values[0];

                        for (int i = 1; i < maxCount; i++) {
                            System.out.print("Enter number " + (i + 1) + ": ");

                            while (!input.hasNextDouble()) {
                                System.out.println("Invalid input. Please enter a number.");
                                input.next();
                                System.out.print("Enter number " + (i + 1) + ": ");
                            }

                            values[i] = input.nextDouble();

                            if (values[i] > maximum) {
                                maximum = values[i];
                            }
                        }

                        System.out.println("Maximum: " + maximum);

                        String result12 = "Maximum = " + maximum;

                        if (historyCount < 10) {
                            history[historyCount] = result12;
                            historyCount++;
                        } else {
                            for (int i = 0; i < 9; i++) {
                                history[i] = history[i + 1];
                            }
                            history[9] = result12;
                        }
                    }

                    break;

                case 13:
                    /* History List */
                    // Challenge 1, showing the last 10 results.

                    System.out.println("\n=== Results History ===");

                    if (historyCount == 0) {
                        System.out.println("No results yet.");
                    } else {
                        for (int i = 0; i < historyCount; i++) {
                            System.out.println((i + 1) + ". " + history[i]);
                        }
                    }
                    break;

                case 0:
                    System.out.println();
                    System.out.println("Thank you so much for testing my codes!! Kudos to you !");
                    break;

                default:
                    System.out.println();
                    System.out.println("Invalid choice.");
                    System.out.println();
            }

        } while (choice != 0);

        input.close();
    }
}
