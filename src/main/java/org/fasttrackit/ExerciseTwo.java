package org.fasttrackit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExerciseTwo {

    List<Integer> list = new ArrayList();

    public void main(){

        int i = requestingTNumberFromUser();
        int qNumberFromUser = requestingQNumberFromUser();

        for (int n = 0; n < i; n++) {
            associatingInputToQueries(qNumberFromUser);
        }




    }

    public void associatingInputToQueries(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Please enter the queries from a-f");
            Scanner scanner = new Scanner(System.in);

            String next = scanner.next();
            if (next.equals("a")) {
                System.out.println("Please insert a number to be added in the list");
                int p = scanner.nextInt();
                queryA(p);
            } else if (next.equals("b")) {
                queryB();
                System.out.println("Query b done");
            } else if (next.equals("c")) {
                queryC();
                System.out.println("Query c done");
            } else if (next.equals("d")) {
                queryD();
                System.out.println("Query d done");
            } else if (next.equals("e")) {
                    queryE();
                    System.out.println("Query e done");
//                    System.out.println("You can't do that right now.");
            } else if (next.equals("f")) {
                queryF();
                System.out.println("Query f done");
            }
        }
    }
    public int requestingTNumberFromUser(){
        int t = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times do you want to repeat this game?");
        try {
            int nextInt = scanner.nextInt();
            if (nextInt <= 1 || nextInt >=100) {
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
    }

    public int requestingQNumberFromUser(){
        int q = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many queries do you want to use?");
        try {
            int nextInt = scanner.nextInt();
            if (nextInt <= 1 || nextInt >=100) {
                System.out.println("You have entered an invalid response");
                main();
            } else {
                q = nextInt;

            }


        }catch (Exception e){
            System.out.println("You have entered an invalid response");
            main();
        }
        return q;
    }

    public void queryA(int number){
        list.add(number);
        System.out.println("Added number " + number + " to the list.");
    }

    public void queryB(){
        Collections.sort(list);
    }

    public void queryC(){
        Collections.reverse(list);
    }

    public void queryD(){
        int size = list.size();
        System.out.println(size);
    }
    public void queryE(){
        for (int i = 0; i < list.size(); i++ ){
            System.out.print(list.get(i) + " ");
        }

    }

    public void queryF(){
        Collections.sort(list, Collections.<Integer>reverseOrder());
    }

    @Override
    public String toString() {
        return "ExerciseTwo{" +
                "list=" + list +
                '}';
    }
}
