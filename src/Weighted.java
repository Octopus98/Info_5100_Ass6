/**
 * Assignment2
 * [Yuhao Zhang]
 * [002743843]
 * [Section08]
 */

import javax.swing.*;
import java.util.Scanner;

public class Weighted {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);  //construct an object scan for receiving the input
//        int totalInput = 0;
//        int earnedInput = 0;
//        int percentInput =0;
//
//        //Receive the input from users
//        System.out.println("Please input the total point for this assignment (should be a positive integer):");
//        while (scan.hasNextLine()) {    //check whether there exists input
//            if (scan.hasNextInt()) {    //check whether the input is an integer
//                totalInput = scan.nextInt();
//                if (totalInput >= 0) {      //check whether the total point typed is correct
//                    System.out.println("The total points you input is " + totalInput);
//                    break;
//                }else {
//                    System.out.println("Please check your input!");
//                    totalInput = scan.nextInt();
//                }
//            } else {
//                System.out.println("Please check your input!");
//                totalInput = scan.nextInt();
//            }
//        }
//
//        //Receive the input from users
//        System.out.println("Please input the point you earned for this assignment (should be a positive integer):");
//        while (scan.hasNextLine()) {    //check whether there exists input
//            if (scan.hasNextInt()) {    //check whether the input is an integer
//                earnedInput = scan.nextInt();
//                if (earnedInput >= 0 && earnedInput <= totalInput) {      //check whether the earned point typed is correct
//                    System.out.println("The earned points you input is " + earnedInput);
//                    break;
//                }else {
//                    System.out.println("Please check your input!");
//                    earnedInput = scan.nextInt();
//                }
//            } else {
//                System.out.println("Please check your input!");
//                earnedInput = scan.nextInt();
//            }
//        }
//
//        //Receive the input from users
//        System.out.println("Please input the percentage of this assignment accounting for of this class grade (should be a positive integer, '%'has been added):");
//        while (scan.hasNextLine()) {    //check whether there exists input
//            if (scan.hasNextInt()) {    //check whether the input is an integer
//                percentInput = scan.nextInt();
//                if (percentInput >= 0 && percentInput <= 100) {      //check whether the percentage typed is correct
//                    System.out.println("The percentage for this assignment you input is " + percentInput + "%");
//                    break;
//                }else {
//                    System.out.println("Please check your input!");
//                    percentInput = scan.nextInt();
//                }
//            } else {
//                System.out.println("Please check your input!");
//                percentInput = scan.nextInt();
//            }
//        }
//
//
//        Point student = new Point();
//        //Set value for parameters
//        student.setTotal(totalInput);
//        student.setEarned(earnedInput);
//        student.setAssPercent(percentInput);
//
//        //Calculate final result using getter in Point class
//        double percent = Double.valueOf(student.getAssPercent())/100;
//        double grade = Double.valueOf(student.getEarned())/ Double.valueOf(student.getTotal())*percent*100;
//        System.out.println("Total weighted grade:" + grade);

        PanelComponents.placeComponents();
    }
}
