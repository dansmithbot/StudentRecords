import java.util.Scanner;
import java.util.ArrayList;

/**
 * Student: Daniel Smith
 * Chapter 7
 * Lab Assignment: HW Student Record, a new take on the Phone Book ArrayList program.
 * This program demonstrates the StudentRecord class.
 */

public class StudentRecordDemo
{
   public static void main(String args[])
   {
      // Add this Student's name and the date this program was created.
      System.out.println("---------------------");
      System.out.println("Author:  Daniel Smith\nCreated: 1/28/2021");
      System.out.println("---------------------\n\n");

      // Constant for the numer of entries.
      final int NUM_ENTRIES = 5;

      // Create an ArrayList to hold StudentRecord objects.
      ArrayList<StudentRecord> list = 
         new ArrayList<StudentRecord>();
         
      // Tell the user what's about to happen.
      System.out.println("I'm going to ask you to enter " +
                         NUM_ENTRIES + " names and phone numbers.");
      System.out.println();
      
      // Create and store StudentRecord objects in the ArrayList.
      for (int i = 0; i < NUM_ENTRIES; i++)
      {
         list.add(createEntry());
         System.out.println();
      }
      
      System.out.println("Here's the data you entered:");
      
      // Display the data stored in the ArrayList.
      for (int i = 0; i < list.size(); i++)
      {
         displayEntry(list.get(i));
      }
   }
   
   /**
    * The getEntry method creates a StudentRecord object
    * populated with data entered by the user and returns
    * a reference to the object.
    */
    
   public static StudentRecord createEntry()
   {
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Variables to hold a person's name and
      // phone number.
      String name,phoneNumber, studentID, major;
      
      // Get the data.
      System.out.print("Enter a person's name: ");
      name = keyboard.nextLine();
      System.out.print("Enter that person's phone number: ");
      phoneNumber = keyboard.nextLine();
      System.out.print("Enter a person's student ID: ");
      studentID = keyboard.nextLine();
      System.out.print("Enter that person's major: ");
      major = keyboard.nextLine();
      
      // Create a StudentRecord object.
      StudentRecord entry = new StudentRecord(name, phoneNumber, studentID, major);
      
      // Return a reference to the object.
      return entry;
   }
   
   /**
    * The displayEntry method displays the data stored
    * in a StudentRecord object.
    */
    
   public static void displayEntry(StudentRecord entry)
   {
      System.out.println("------------------------------");
      System.out.println("Name:         " + entry.getName());
      System.out.println("Phone number: " + entry.getPhoneNumber());
      System.out.println("Student ID:   " + entry.getStudentID());
      System.out.println("Major:        " + entry.getMajor());
   }
}