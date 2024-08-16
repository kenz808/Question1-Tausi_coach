/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.tausicoach;

/**
 *
 * @author Benjn
 */
public class TausiCoach {
    public static void main(String[] args) {
        int totalDistance = 10000;
        int stopDistancePassenger = 150;
        int stopDistanceFuel = 200;

        int stopsForPassengers = totalDistance / stopDistancePassenger;
        int stopsForFuel = totalDistance / stopDistanceFuel;

        System.out.println("Stops for passengers: " + stopsForPassengers);
        System.out.println("Stops for refueling: " + stopsForFuel);
    }
}
