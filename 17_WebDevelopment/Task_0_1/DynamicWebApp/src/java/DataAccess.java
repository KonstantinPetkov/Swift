
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import javafx.scene.chart.PieChart.Data;
import org.apache.tomcat.jni.*;

public class DataAccess {

    static final String DBMS_CONN_STRING = "jdbc:mysql://127.0.0.1:3306/citizen_registrations";
    static final String DBMS_USERNAME = "root";
    static final String DBMS_PASSWORD = "KOsio5252@";

    public static void main(String[] args) throws FileNotFoundException, IOException { 

    

    public Data getParameter(int id) {

        try (Connection conn = DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
                PreparedStatement statement = conn.prepareStatement("SELECT * FROM citizen WHERE id = ?")) {

            statement.setInt(1, id);

            try (ResultSet rs = statement.executeQuery()) {

                if (!rs.next()) {
                    return null;
                }

                String firstName = rs.getString("firstName");
                if (rs.wasNull()) {
                    firstName = null;
                }

                String surName = rs.getString("surName");
                if (rs.wasNull()) {
                    surName = null;
                }

                Data data = new Data (rs.getString("middleName"),
                        rs.getInt("gender"),
                        rs.getDouble("height"),
                        rs.getDate("LocalDate"),
                        rs.getString("address"),
                        rs.getString("education"),
                        rs.getInt("insurance"),
                        firstName,
                        surName);

            }
        } catch (SQLException ex) {
            while (ex != null) {
                System.out.println(ex.getSQLState());
                System.out.println(ex.getMessage());
                System.out.println(ex.getErrorCode());
                ex = ex.getNextException();
            }
        }
        
        return data;
    }
}
