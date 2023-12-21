
package Proxy.LabTask;
public class RealExam implements Exam {

   private String examData;

   @Override
   public void load() {
      // Load the exam data (e.g., from a database or file)
      System.out.println("Loading exam data...");
      examData = "Real exam questions and answers";
   }

   @Override
   public void displayResults(String studentId) {
      // Display the results for the specific student
      System.out.println("Displaying results for student " + studentId + ": " + examData);
   }
}