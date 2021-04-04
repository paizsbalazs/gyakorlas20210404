package gy;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HouseCup {

    private DataSource dataSource = new MariaDbDataSource();

    public HouseCup(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public int getPointsOfHouse(String house) {

        int result = 0;

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("select house_name, points_earned from house_points where house_name = ?");
        ) {
            stmt.setString(1, house);


            try (
                    ResultSet rs = stmt.executeQuery();
            ) {
                while (rs.next()) {
                    result = result + rs.getInt("points_earned");
                }
                return result;
            } catch (SQLException sqle) {
                throw new IllegalArgumentException("Error by insert", sqle);
            }

        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }

    }
}
