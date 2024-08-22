package com.scripts.sdexam;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String departurePort = "Hong Kong";  // Example user input
        String arrivalPort = "Laem Chabang"; // Example user input

        List<Voyage> voyages = VoyageSearch.searchVoyages(departurePort, arrivalPort);

        if (voyages.isEmpty()) {
            System.out.println("No voyages found for this route.");
        } else {
            for (Voyage voyage : voyages) {
                System.out.println(voyage);
            }
        }
    }
}