package com.scripts.sdexam;
import lombok.Getter;
import lombok.Setter;

// Voyage class, to be populated with the corresponding "voyage" SQL Schema
@Getter
@Setter
public class Voyage {
    private String departureDate;
    private String arrivalDate;
    private String vesselName;
    private String departurePort;
    private String arrivalPort;
    private int spaceAvailable;
    private int spaceBooked;

    // The constructor for the voyage class
    public Voyage(String departureDate, String arrivalDate, String vesselName, String departurePort, String arrivalPort, int spaceAvailable, int spaceBooked) {
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.vesselName = vesselName;
        this.departurePort = departurePort;
        this.arrivalPort = arrivalPort;
        this.spaceAvailable = spaceAvailable;
        this.spaceBooked = spaceBooked;
    }

    // Print a voyage to String
    // Used for testing before GUI is finished
    @Override
    public String toString() {
        return "Voyage{" +
                "departureDate='" + departureDate + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", vesselName='" + vesselName + '\'' +
                ", departurePort='" + departurePort + '\'' +
                ", arrivalPort='" + arrivalPort + '\'' +
                ", spaceAvailable=" + spaceAvailable +
                ", spaceBooked=" + spaceBooked +
                '}';
    }
}
