package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void menu(ArrayList<Student> list) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Sort by:");
        System.out.println("1. First Name");
        System.out.println("2. Last Name");
        System.out.println("3. Age");
        System.out.println("4. City");

        switch(scan.nextInt()) {
            case 1:
                Collections.sort(list, new SortByFirstName());
                break;
            case 2:
                Collections.sort(list, new SortByLastName());
                break;
            case 3:
                Collections.sort(list, new SortByAge());
                break;
            case 4:
                Collections.sort(list, new SortByCity());
                break;
            default:
                System.out.println("Invalid input"); break;
        }

        System.out.println("****************************************");
        System.out.println("After sorting:");
        for(Student student : list) {
            System.out.println(student);
        }
    }

    public static void askDetails(ArrayList<Student> list) {
        Scanner scan = new Scanner(System.in);
        String lastName;
        System.out.print("Enter Name: ");
        String name = scan.nextLine();

        // Splitting name into first name and last name
        String firstName = name.split(" ")[0];
        try {
            lastName = name.split(" ")[1];
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            lastName = "";
        }

        System.out.print("Enter Age: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter City: ");
        String city = scan.nextLine();

        // Adding student record to the list
        list.add(new Student(firstName, lastName, age, city));

        System.out.println("Do you want to add more (y/n)? ");
        if(scan.nextLine().equals("y"))
            askDetails(list);
        else {
            System.out.println("****************************************");
            System.out.println("Before sorting:");
            for(Student student : list) {
                System.out.println(student);
            }
            menu(list);
        }

    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        askDetails(list);
    }
}
