/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    double F;
    double C;

    public static void main(String[] args) {
        App myApp = new App();
        myApp.readUserChoice();
    }

    public void readUserChoice(){
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour Choice: ");
        String input = in.nextLine().toLowerCase();
        if (input.equals("f")){
            System.out.print("Please enter the temperature in Celsius: ");
            C = in.nextDouble();
            CelsiusFahrenheit(C);
        }
        else if (input.equals("c")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            F = in.nextDouble();
            FahrenheitCelsius(F);
        }
    }

    public void FahrenheitCelsius(double Fahrenheit){
        double FtoC = ((Fahrenheit-32)*5)/9;
        System.out.printf("The temperature in Celsius is %s.", FtoC);
    }

    public void CelsiusFahrenheit(double Celsius){
        double CtoF = ((Celsius*9)/5)+32;
        System.out.printf("The temperature in Fahrenheit is %s.", CtoF);
    }
}