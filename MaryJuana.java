/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mary.juana;

import java.util.Scanner;

/**
 *
 * @author Paden_CPE
 */
public class MaryJuana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Temperature Converter");
        System.out.println("Select Unit Convertion "
                + "1.For C to F "
                + "2.For C to K "
                + "3.For F to C "
                + "4.For F to K "
                + "5.For K to C "
                + "6.For K to F ");
        int a = input.nextInt();

        if (a == 1) {
            System.out.println("Input Value of Celsius");
            int c = input.nextInt();
            double ans = ((c * 9 / 5) + 32);
            System.out.println("The temperature " + ans +" degrees Celsius");
        } else if (a == 2) {
            System.out.println("Input Value of Celsius");
            int c = input.nextInt();
            double ans = (c + 273.15);
            System.out.println("The temperature " + ans +" Kelvin");
        } else if (a == 3) {
            System.out.println("Input Value of Farenheit");
            int c = input.nextInt();
            double ans = ((c - 32) * 5 / 9);
            System.out.println("The temperature " + ans +" degrees Celsius");
        } else if (a == 4) {
            System.out.println("Input Value of Farenheit");
            int c = input.nextInt();
            double ans = ((c - 32) * 5 / 9 + 273.15);
            System.out.println("The temperature " + ans +" Kelvin");
        } else if (a == 5) {
            System.out.println("Input Value of Kelvin");
            int c = input.nextInt();
            double ans = (c - 273.15);
            System.out.println("The temperature " + ans +" degrees Celsius");
        } else if (a == 6) {
            System.out.println("Input Value of Kelvin");
            int c = input.nextInt();
            double ans = (((c - 273.15) * 9 / 5) + 32);
            System.out.println("The temperature " + ans +" degrees Farenheit");
        }   
    }
}
