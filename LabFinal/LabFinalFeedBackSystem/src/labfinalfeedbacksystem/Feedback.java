/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labfinalfeedbacksystem;

/**
 *
 * @author Hafiz laptop
 */
class Feedback {
    private User user;
    private String content;
    private FeedbackMechanism mechanism;

    public Feedback(User user, String content, FeedbackMechanism mechanism) {
        this.user = user;
        this.content = content;
        this.mechanism = mechanism;
    }

    public String getContent() {
        return content;
    }
}
