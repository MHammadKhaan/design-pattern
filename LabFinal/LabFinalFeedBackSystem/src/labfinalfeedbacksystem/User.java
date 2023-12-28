/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labfinalfeedbacksystem;

/**
 *
 * @author Hafiz laptop
 */
public class User {
    private String name;
    private String role; 

    public User(String name, String role) {
        if (name == null || role == null) {
            throw new IllegalArgumentException("Name and role cannot be null");
        }
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}
