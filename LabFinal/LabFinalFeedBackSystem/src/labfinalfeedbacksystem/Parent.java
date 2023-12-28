/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labfinalfeedbacksystem;

/**
 *
 * @author Hafiz laptop
 */
class Parent implements Observer {
    public void update(Feedback feedback) {
        // Simulated implementation details for how parents handle feedback updates
        System.out.println("Parent received feedback: " + feedback.getContent());
    }
}
