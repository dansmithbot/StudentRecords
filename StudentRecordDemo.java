import java.util.Scanner;
import java.util.ArrayList;

/**
 * Student: Daniel Smith
 * Chapter 7
 * Lab Assignment: Student Record Demo, updated 08/31/2023.
 * This program demonstrates the StudentRecord class.
 */
public class StudentRecordDemo {
   public static void main(String args[]) {
      System.out.println("---------------------");
      System.out.println("Author:  Daniel Smith\nCreated: 1/28/2021");
      System.out.println("---------------------\n\n");

      final int NUM_ENTRIES = 5;

      ArrayList<StudentRecord> list = new ArrayList<>();

      System.out.println("I'm going to ask you to enter " + NUM_ENTRIES + " student records.\n");

      for (int i = 0; i < NUM_ENTRIES; i++) {
         list.add(createEntry());
         System.out.println();
      }

      System.out.println("Here's the data you entered:\n");

      for (StudentRecord entry : list) {
         displayEntry(entry);
      }
   }

   public static StudentRecord createEntry() {
      Scanner keyboard = new Scanner(System.in);
      String name, phoneNumber, studentID, major;

      System.out.print("Enter a person's name: ");
      name = keyboard.nextLine();
      System.out.print("Enter that person's phone number: ");
      phoneNumber = keyboard.nextLine();
      System.out.print("Enter a person's student ID: ");
      studentID = keyboard.nextLine();
      System.out.print("Enter that person's major: ");
      major = keyboard.nextLine();

      return new StudentRecord(name, phoneNumber, studentID, major);
   }

   public static void displayEntry(StudentRecord entry) {
      System.out.println("------------------------------");
      System.out.println(entry);
   }
}
