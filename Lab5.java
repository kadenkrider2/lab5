/* 
* Program : Lab5.java
*
* Author : Kaden Krider
* Date:   2/24/23
*
*
*
* Program Description:
*
*
* This program  prompts a user to choose between a Ciruclar
* Cone Volume Calculator, A BMI Calculator, A THR Calculator, A Tip Calculator , or an Even Odd *Number   lister , The program then preforms a specific task based on the users input
*
*
*
*/




import java.util.Scanner;

 public class Lab5 {
 
    
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
 
         System.out.println("Main Menu");
         System.out.println("-----------------------------------");
         System.out.println("1. Circular Cone Volume Calculator");
         System.out.println("2. BMI Calculator");
         System.out.println("3. THR Calculator");
         System.out.println("4. Tip Calculator");
         System.out.println("5. Even/Odd Number Lister");
         System.out.println("-----------------------------------");
         System.out.print("Enter Option: ");
         int choice = input.nextInt();


         if (choice == 1) {
            System.out.println("\nThis program calculates the volume of a cone");
            System.out.println("==================================================");
            System.out.print("Please enter the radius (r): ");
            double radius = input.nextDouble();
            System.out.print("Please enter the height (h): ");
            double height = input.nextDouble();
            double volume = (1.0 / 3.0) * Math.PI * radius * radius * height;
            System.out.println("--------------------------------------------------");
            System.out.printf("The volume of the circular cone is: %.3f%n", volume);
            System.out.println("==================================================");


        } else if (choice == 2) {
            System.out.println("\nThis program calculates your Body Mass Index (BMI)");
            System.out.println("==================================================");
            System.out.print("Enter your weight in pounds: ");
            double weight = input.nextDouble();
            System.out.print("Enter your height in inches: ");
            double height = input.nextDouble();
            double BMI = (weight * 703) / (height * height);
            System.out.println("--------------------------------------------------");
            System.out.printf("Your BMI is: %.1f%n", BMI);
            System.out.println("==================================================");


        } else if (choice == 3) {
            System.out.println("\nThis program calculates your Target Heart Rate (THR)");
            System.out.println("==================================================");
            System.out.print("Please enter your age in years: ");
            int age = input.nextInt();
            double intensity = 0.75;
            double THR = (220 - age) * intensity;
            System.out.println("--------------------------------------------------");
            System.out.println("Your intensity is " + (int)(intensity * 100) + "%");
            System.out.println("--------------------------------------------------");
            System.out.printf("Your THR is: %.1f%n", THR);
            System.out.println("==================================================");



        } else if (choice == 4) {
            System.out.println("\nThis program calculates your tip");
            System.out.println("==================================================");
            System.out.print("Please enter the price of the meal: ");
            double price = input.nextDouble();
            System.out.print("Please enter the tip rate: ");
            int tipRate = input.nextInt();
            double tip = price * tipRate / 100.0;
            System.out.println("--------------------------------------------------");
            System.out.printf("Your tip is: %.2f%n", tip);
            System.out.println("==================================================");



        
        } else if (choice == 5) {
            System.out.println("\nThis program lists all integer numbers between a & b and labels each number as an even or an odd number");
            System.out.println("==================================================");
            System.out.print("Please enter a: ");
            int a = input.nextInt();
            System.out.print("Please enter b: ");
            int b = input.nextInt();
            if (a >= b) {
                System.out.println("Error: a must be less than b");
            } else {
                for (int i = a; i <= b; i++) {
                    String label = (i % 2 == 0) ? "Even" : "Odd";
                    System.out.printf("%d - %s%n", i, label);





         }
     }
  }
 }
 }

 
 




