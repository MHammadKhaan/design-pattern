/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labfinalfeedbacksystem;

/**
 *
 * @author Hafiz laptop
 */
class Student implements Observer {
    public void update(Feedback feedback) {
        // Simulated implementation details for how students handle feedback updates
        System.out.println("Student received feedback: " + feedback.getContent());
    }
}