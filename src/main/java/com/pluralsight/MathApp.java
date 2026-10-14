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
        double workingNumber = 5.0;
        double sqrtNumber = Math.sqrt(workingNumber);
        System.out.println("The square root of " + workingNumber + " is " + sqrtNumber);

        System.out.println();

        //Question 5:
        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;

        double distanceSquared = Math.pow(Math.abs(x1-x2), 2) + Math.pow(Math.abs(y1-y2), 2);
        System.out.println("The distance between the two points (5, 10) and (85, 50) is " + Math.sqrt(distanceSquared));

        System.out.println();

        //Question 6:
        double negativeValue = -3.8;
        System.out.println("The absolute value is " + Math.abs(negativeValue));

        System.out.println();

        //Question 7:
        System.out.println(Math.random());

        System.out.println();

        //Question 8:
        int dayCount = 24;
        int hoursInDay = 24;
        int minutesInHour = 60;
        int minutesInDay = hoursInDay * minutesInHour;
        System.out.println("There are " + dayCount * minutesInDay + " minutes in " + dayCount + " days."  );
    }
}
