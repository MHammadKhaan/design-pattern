
package Proxy.LabTask;


public class ProxyPatternMain {
	
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display(); 
        System.out.println("");

        //image will not be loaded from disk
        image.display(); 	

        Exam virtualProxyExam = new RemoteProxyExam();

        virtualProxyExam.load();

        virtualProxyExam.displayResults("Fa20-bse-031");

        Exam protectedProxyExam = new ProtectedProxyExam("Sir Mukhtiyar Zamin");

        protectedProxyExam.load();
        
//        protectedProxyExam.displayResults("anyStudentId");
        protectedProxyExam.displayResults("StudentId");

      
   }
}