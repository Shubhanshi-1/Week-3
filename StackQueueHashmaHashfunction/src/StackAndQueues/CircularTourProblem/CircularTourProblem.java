package StackAndQueues.CircularTourProblem;

public class CircularTourProblem {

    public static void main(String[] args) {
        CircularTour circularTour = new CircularTour();
        int[] petrol = {4, 6, 7, 4};  // Petrol available at each pump
        int[] distance = {6, 5, 3, 5}; // Distance to next pump

        int start = circularTour.findStartingPoint(petrol, distance);
        if (start == -1) {
            System.out.println("No valid starting point for the circular tour.");
        } else {
            System.out.println("Start at petrol pump index: " + start);
        }
    }
}
