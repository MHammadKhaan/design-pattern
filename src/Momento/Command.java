/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Momento;

/**
 *
 * @author fa20-bse-031
 */
public interface Command {
    String getName();
    void execute();
}