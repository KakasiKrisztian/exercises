package org.fasttrackit;

public class testClass implements in1 {
    @Override
    public void display(int p) {

    }

    public void sumOfPrimeNumbers(int number){
        int sum = 0;
        for (int i = 2; i <= number; i++){
            if (number % i == 0){
                sum += i;
            }
        }

    }

    

}
