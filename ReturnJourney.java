/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.tausicoach;

/**
 *
 * @author Benjn
 */
public class ReturnJourney {
    public static void main(String[] args) {
        int totalDistance = 10000;
        int speed = 250; // km/hr
        int stops = totalDistance / 200;
        int stopTime = stops * 5;

        double travelTime = (double) totalDistance / speed;
        double totalTime = travelTime + (stopTime / 60.0); 

        System.out.println("Total travel time for return journey: " + totalTime + " hours");
    }
}

