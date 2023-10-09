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
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Temperature Converter");
        System.out.println("Select Unit Convertion ");
        System.out.println("1.For C to F ");
        System.out.println("2.For C to K ");
        System.out.println("3.For F to C ");
        System.out.println("4.For F to K ");
        System.out.println("5.For K to C ");
        System.out.println("6.For K to F ");
        int a = input.nextInt();

        switch (a) {
            case 1: {
                System.out.println("Input Value of Celsius");
                int c = input.nextInt();
                double ans = ((c * 9 / 5) + 32);
                System.out.println("The temperature " + ans + " degrees Farenheit");
                break;
            }
            case 2: {
                System.out.println("Input Value of Celsius");
                int c = input.nextInt();
                double ans = (c + 273.15);
                System.out.println("The temperature " + ans + " Kelvin");
                break;
            }
            case 3: {
                System.out.println("Input Value of Farenheit");
                int c = input.nextInt();
                double ans = ((c - 32) * 5 / 9);
                System.out.println("The temperature " + ans + " degrees Celsius");
                break;
            }
            case 4: {
                System.out.println("Input Value of Farenheit");
                int c = input.nextInt();
                double ans = ((c - 32) * 5 / 9 + 273.15);
                System.out.println("The temperature " + ans + " Kelvin");
                break;
            }
            case 5: {
                System.out.println("Input Value of Kelvin");
                int c = input.nextInt();
                double ans = (c - 273.15);
                System.out.println("The temperature " + ans + " degrees Celsius");
                break;
            }
            case 6: {
                System.out.println("Input Value of Kelvin");
                int c = input.nextInt();
                double ans = (((c - 273.15) * 9 / 5) + 32);
                System.out.println("The temperature " + ans + " degrees Farenheit");
                break;
            }
            default:
                break;
        }
    }
}
