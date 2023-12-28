/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labfinalfeedbacksystem;

/**
 *
 * @author Hafiz laptop
 */
import java.util.ArrayList;
import java.util.List;
class FeedbackSystem {
    private List<FeedbackMechanism> feedbackMechanisms;
    private List<Observer> observers;

    public FeedbackSystem() {
        this.feedbackMechanisms = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addFeedbackMechanism(FeedbackMechanism mechanism) {
        this.feedbackMechanisms.add(mechanism);
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void collectFeedback(User user, FeedbackMechanism mechanism) {
        Feedback feedback = mechanism.collectFeedback(user);
        notifyObservers(feedback);
    }

    private void notifyObservers(Feedback feedback) {
        for (Observer observer : observers) {
            observer.update(feedback);
        }
    }
}
