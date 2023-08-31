/**
 * Student: Daniel Smith
 * Chapter 7
 * Programming Challenge 14: Student Record Class
 * The StudentRecord class stores a person's name, phone number, student ID, and major.
 */
public class StudentRecord {
   private String name, phoneNumber, studentID, major;

   /**
    * Constructor to initialize the person's information.
    */
   public StudentRecord(String name, String phoneNumber, String studentID, String major) {
      this.name = name;
      this.phoneNumber = phoneNumber;
      this.studentID = studentID;
      this.major = major;
   }

   @Override
   public String toString() {
      return "Name: " + name + "\nPhone number: " + phoneNumber + "\nStudent ID: " + studentID + "\nMajor: " + major;
   }
}
