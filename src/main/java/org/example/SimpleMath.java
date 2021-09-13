/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
package org.example;
import java.util.Scanner;
public class SimpleMath {

    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.print("Enter the first number: ");
       num1 = number.nextInt();
        System.out.print("Enter the second number: ");
        num2 = number.nextInt();
        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;
        int div = num1 / num2;
        System.out.print(num1 + " + " + num2 +" = " + sum+"\n"+ num1 +" - "+num2+" = "+diff+"\n"+num1+ " * "+
                num2+" = "+prod+"\n"+ num1+" / "+num2+" = "+div);


    }

}
