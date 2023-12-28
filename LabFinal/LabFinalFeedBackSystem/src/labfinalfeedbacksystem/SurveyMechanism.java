/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labfinalfeedbacksystem;

/**
 *
 * @author Hafiz laptop
 */
class SurveyMechanism implements FeedbackMechanism {
    public Feedback collectFeedback(User user) {
        // Simulated implementation details for collecting feedback via survey
        return new Feedback(user, "Survey feedback", this);
    }
}
