package StackAndQueues.CircularTourProblem;

class CircularTour {
    public int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        int totalSurplus = 0;  // Net petrol balance
        int currentSurplus = 0; // Petrol balance while traversing
        int startIndex = 0;     // Potential starting point

        for (int i = 0; i < n; i++) {
            int balance = petrol[i] - distance[i];
            totalSurplus += balance;
            currentSurplus += balance;

            // If balance becomes negative, reset starting point
            if (currentSurplus < 0) {
                startIndex = i + 1;
                currentSurplus = 0;
            }
        }

        // If totalSurplus is negative, no valid tour is possible
        return (totalSurplus >= 0) ? startIndex : -1;
    }
}