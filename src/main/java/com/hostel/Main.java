package com.hostel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Student Model Class
class Student {
    String name;
    int rollNo;
    int roomNo;

    public Student(String name, int rollNo, int roomNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.roomNo = roomNo;
    }

    public void displayInfo() {
        System.out.println("Roll No: " + rollNo + " | Name: " + name + " | Room No: " + roomNo);
    }
}

// Main Application Class
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("\n================================");
            System.out.println("      HOSTEL MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Room Management");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // clear non-integer input
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline left by nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter roll number: ");
                    int rollNo = sc.nextInt();

                    System.out.print("Enter room number: ");
                    int roomNo = sc.nextInt();

                    // Create student object and add to list
                    Student newStudent = new Student(name, rollNo, roomNo);
                    studentList.add(newStudent);

                    System.out.println("\nStudent added successfully!");
                    break;

                case 2:
                    System.out.println("\n--- LIST OF REGISTERED STUDENTS ---");
                    if (studentList.isEmpty()) {
                        System.out.println("No students registered yet.");
                    } else {
                        for (Student s : studentList) {
                            s.displayInfo();
                        }
                    }
                    break;

                case 3:
    System.out.println("\n--- ROOM MANAGEMENT ---");
    System.out.println("1. View Room");
    System.out.println("2. Back to Main Menu");
    System.out.print("Enter your choice: ");

    int roomChoice = sc.nextInt();

    switch (roomChoice) {
        case 1:
            System.out.println("\nRoom No: 109");
            System.out.println("Occupied By: Viraj");
            System.out.println("Status: Occupied");
            break;

        case 2:
            System.out.println("Returning to Main Menu...");
            break;

        default:
            System.out.println("Invalid room choice.");
    }
    break;

                case 4:
                    System.out.println("\nThank you for using Hostel Management System!");
                    running = false;
                    break;

                default:
                    System.out.println("\nInvalid choice! Please select an option between 1 and 4.");
            }
        }

        sc.close();
    }
}