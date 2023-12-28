/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labfinalfeedbacksystem;

/**
 *
 * @author Hafiz laptop
 */
public class LabFinalFeedBackSystem {
    public static void main(String[] args) {
        FeedbackSystem feedbackSystem = new FeedbackSystem();

        // Create feedback mechanisms
        FeedbackMechanism surveyMechanism = new SurveyMechanism();
        FeedbackMechanism pollingMechanism = new PollingMechanism();
        FeedbackMechanism directContactMechanism = new DirectContactMechanism();

        // Add mechanisms to the system
        feedbackSystem.addFeedbackMechanism(surveyMechanism);
        feedbackSystem.addFeedbackMechanism(pollingMechanism);
        feedbackSystem.addFeedbackMechanism(directContactMechanism);

        // Create users
        User studentUser = new User("Hammad", "student");
        User parentUser = new User("Muhammad", "parent");
        User teacherUser = new User("SirMukhtiyar ", "teacher");
        User administratorUser = new User("Admin ", "administrator");

        // Create observers
        Observer studentObserver = new Student();
        Observer parentObserver = new Parent();
        Observer teacherObserver = new Teacher();
        Observer administratorObserver = new Administrator();

        // Add observers to the system
        feedbackSystem.addObserver(studentObserver);
        feedbackSystem.addObserver(parentObserver);
        feedbackSystem.addObserver(teacherObserver);
        feedbackSystem.addObserver(administratorObserver);

        // Simulate collecting feedback using different mechanisms
        feedbackSystem.collectFeedback(studentUser, surveyMechanism);
        feedbackSystem.collectFeedback(parentUser, pollingMechanism);
        feedbackSystem.collectFeedback(teacherUser, directContactMechanism);
    }
}
