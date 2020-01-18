package org.fasttrackit;

import java.util.Scanner;

public class TestClass implements in1 {
    public void start(){
        int number = requestingNumberFromUser();
        display(number);
    }
    @Override
    public void display(int p) {

        sumOfPrimeNumbers(p);
    }

    public void sumOfPrimeNumbers(int number) {
        int i, sum = 0;
        for (int p = 2; p <= number; p++) {
            int count = 0;
            for (i = 2; i <= number / 2; i++) {
                if (p % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && number != 1) {
                sum += p;
                System.out.println(p + " is a Prime Number");
            } else {
                System.out.println(p + " is Not a Prime Number");
            }


        }
        System.out.println("The sum of the prime numbers is: " + sum);

    }

    public int requestingNumberFromUser(){
        int number = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter any Number: ");
        try {
            number = sc.nextInt();
        }catch (Exception e){
            requestingNumberFromUser();
        }
        return number;
    }
}