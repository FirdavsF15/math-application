package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        //Question 1:
        int bobSalary = 40_000, garySalary = 50_000, highestSalary;
        highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is $" + highestSalary);

        System.out.println();

        //Question 2:
        double carPrice = 30_000, truckPrice = 45_000;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is $" + lowestPrice);

        System.out.println();

        //Question 3:
        double circleRadius = 7.25;
        double circleArea = Math.PI * Math.pow(circleRadius, 2.0);
        System.out.println("The area of the circle is " + circleArea);

        System.out.println();

        //Question 4:

    }
}
