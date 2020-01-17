package org.fasttrackit;

import java.util.Scanner;

public class ExerciseThree {


    public void main (){
        int tNumberFromUser = requestingTNumberFromUser();
        for (int i = 0; i < tNumberFromUser; i++){
            int nNumberFromUser = requestingNNumberFromUser();
            sumOfEvenAndOddNumbers(nNumberFromUser);
        }

    }

    public int requestingTNumberFromUser(){
        int t = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times do you want to repeat this game?");
        try {
            int nextInt = scanner.nextInt();
            if (nextInt <= 1 || nextInt >=200) {
                System.out.println("You have entered an invalid response");
                main();
            } else {
                t = nextInt;

            }


        }catch (Exception e){
            System.out.println("You have entered an invalid response");
            main();
        }
        return t;
    }public int requestingNNumberFromUser(){
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a number.");
        try {
            int nextInt = scanner.nextInt();
            if (nextInt <= 1 || nextInt >=200) {
                main();
            } else {
                n = nextInt;

            }


        }catch (Exception e){
            System.out.println("You have entered an invalid response");
            main();
        }
        return n;
    }

    public void sumOfEvenAndOddNumbers(int N){
        int odd = 0;
        int even = 0;
        for (int i = 0; i <= N; i++){
                if (i % 2 == 0){
                    even += i;
                }else {
                    odd += i;
                }
        }

            System.out.println(even + " " + odd);

    }

}
