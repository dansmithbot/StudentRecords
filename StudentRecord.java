/**
 * Student: Daniel Smith
 * Chapter 7
 * Programming Challenge 14: Phone Book ArrayList (altered to suit homework assignment, "HW Student Record")
 * The StudentRecord class stores a person's name, phone number, student ID and major.
 * 
 * The method names, class names and file names in this file and the demo file have been refactored, 
 * in order to draw contrast between it and the original Phone Book program.
 */

public class StudentRecord
{
   private String name, phoneNumber, studentID, major; // Student's information.

   /**
    * The constructor initializes the person's name
    * and phone number.
    */
   public StudentRecord(String name, String phoneNumber, String studentID, String major)
   {
      this.name = name;
      this.phoneNumber = phoneNumber;
      this.studentID = studentID; 
      this.major = major;
   }
   
   /**
    * The setName method sets the person's name.
    */
    public void setName(String name)
    {
       this.name = name;
    }
      
   /**
    * The setPhoneNumber method sets the person's 
    * phone number.
    */
   public void setPhoneNumber(String phoneNumber)
   {
      this.phoneNumber = phoneNumber;
   }

   /**
    * The setMajor method sets the person's 
    * major.
    */
   public void setMajor(String major) {
      this.major = major;
   }
   
   /**
    * The setStudentID method sets the person's 
    * student ID.
    */
   public void setStudentID(String studentID) {
      this.studentID = studentID;
   }

   /**
    * The The getName method returns the person's 
    * name.
    */
   public String getName()
   {
      return name;
   }
   
   /**
    * The getPhoneNumber method returns the
    * person's phone number.
    */
   public String getPhoneNumber()
   {
      return phoneNumber;
   }

   /**
    * The getStudentID method returns the person's 
    * studentID.
    */
   public String getStudentID() {
      return studentID;
   }

   /**
    * The getMajor method returns the person's 
    * major.
    */
   public String getMajor() {
      return major;
   }

}
