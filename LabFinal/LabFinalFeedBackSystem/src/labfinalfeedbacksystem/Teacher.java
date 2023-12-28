/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labfinalfeedbacksystem;

/**
 *
 * @author Hafiz laptop
 */
class Teacher implements Observer {
    public void update(Feedback feedback) {
        // Simulated implementation details for how teachers handle feedback updates
        System.out.println("Teacher received feedback: " + feedback.getContent());
    }
}
