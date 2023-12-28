/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labfinalfeedbacksystem;

/**
 *
 * @author Hafiz laptop
 */
class DirectContactMechanism implements FeedbackMechanism {
    public Feedback collectFeedback(User user) {
        // Simulated implementation details for collecting feedback via direct contact
        return new Feedback(user, "Direct contact feedback", this);
    }
}