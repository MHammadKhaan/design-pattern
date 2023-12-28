/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labfinalfeedbacksystem;

/**
 *
 * @author Hafiz laptop
 */
class PollingMechanism implements FeedbackMechanism {
    public Feedback collectFeedback(User user) {
        // Simulated implementation details for collecting feedback via polling
        return new Feedback(user, "Polling feedback", this);
    }
}