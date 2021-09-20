package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("total marks");
        double totalMarks = input.nextDouble();
        while(true){
            System.out.println("mark gotten");
            double studentMark = input.nextDouble();
            double percentage = studentMark / totalMarks * 100;
            if (percentage <= 40) {
                System.out.println("grade U");
            } else {
                if ((percentage > 40) && (percentage <= 49)) {
                    System.out.println("grade E");
                } else {
                    if ((percentage > 50) && (percentage <= 59)) {
                        System.out.println("grade D");
                    } else {
                        if ((percentage > 60) && (percentage <= 69)) {
                            System.out.println("grade C");
                        } else {
                            if ((percentage > 70) && (percentage <= 79)) {
                                System.out.println("grade B");
                            }
                             else {
                                if (percentage >= 80) {
                                    System.out.println("grade A");
                                }
                            }

                        }
                    }

                }
            }
        }
    }
}