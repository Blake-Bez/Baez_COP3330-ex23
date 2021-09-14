/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Blake Baez
 */
package org.example;
import java.util.Scanner;

public class App 
{

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Is the car silent when you turn the key?(y or n) ");
            String start = scan.nextLine();
            if (start.equalsIgnoreCase("y")){
                System.out.print("Are the battery terminals corroded?(y or n) ");
                String corroded = scan.nextLine();

                if(corroded.equalsIgnoreCase("y")){
                    System.out.print("Clean terminals and try starting again.");
                }
                else{
                    System.out.print("Replace cables and try again.");
                }
            }
            else{
                System.out.print("Does the car make a slicking noise?(y or no) ");
                String slicking = scan.nextLine();
                if(slicking.equalsIgnoreCase("y")){
                    System.out.print("Replace the battery.");
                }
                else{
                    System.out.print("Does the car crank up but fail to start?(y or no) ");
                    String crank = scan.nextLine();
                    if(crank.equalsIgnoreCase("y")){
                        System.out.print("Check spark plug connections.");
                    }
                    else{
                        System.out.print("Does the engine start and then die?(y or no) ");
                        String die = scan.nextLine();
                        if(die.equalsIgnoreCase("y")){
                            System.out.print("Does your car have fuel injection?(y or no) ");
                            String fuelInjection = scan.nextLine();
                            if(fuelInjection.equalsIgnoreCase("y")){
                                System.out.print("Get it in for service.");
                            }
                            else{
                                System.out.print("Check to ensure the choke is opening and closing.");
                            }
                        }
                        else{
                            System.out.print("This should not be possible.");
                        }
                    }
                }
            }
        }
    }