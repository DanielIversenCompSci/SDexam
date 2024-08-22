package com.scripts.sdexam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VoyageSearch {

    public static List<Voyage> searchVoyages(String departurePort, String arrivalPort) {
        List<Voyage> voyages = new ArrayList<>();

        String query = "SELECT * FROM voyage WHERE departurePort = ? AND arrivalPort = ?";

        try (Connection conn = dbConnect.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            // Fills in the placeholder "?" in the sql query
            stmt.setString(1, departurePort);
            stmt.setString(2, arrivalPort);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // Using the constructor I made in the Voyage class,
                // these are added in the order as the constructor is defined
                Voyage voyage = new Voyage(
                        rs.getString("departureDate"),
                        rs.getString("arrivalDate"),
                        rs.getString("vesselName"),
                        rs.getString("departurePort"),
                        rs.getString("arrivalPort"),
                        rs.getInt("spaceAvailable"),
                        rs.getInt("spaceBooked")
                );
                voyages.add(voyage);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return voyages;
    }
}
