/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.tausicoach;

/**
 *
 * @author Benjn
 */
public class SecondCoach {
    public static void main(String[] args) {
        double speed = 225.5 / 1000 * 3600; // Convert m/s to km/hr
        int totalDistance = 10000;
        int startTime = 9; // 9:00 hrs

        double travelTime = totalDistance / speed;
        double arrivalTime = startTime + travelTime;

        System.out.println("Approximate arrival time: " + arrivalTime + " hours");
    }
}
