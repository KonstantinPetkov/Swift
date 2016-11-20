
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MySqlSchoolData {

    static final String DBMS_CONN_STRING = "jdbc:mysql://127.0.0.1:3306/school";
    static final String DBMS_USERNAME = "root";
    static final String DBMS_PASSWORD = "KOsio5252@";

    public static void main(String[] args) {

        String sqlStatement1 = "INSERT INTO teachers(id, name, email, salary) "
                + "VALUES(1, Lubo Ivanov, livanov@gmail.com, 9999) ";

        try (Connection con = DriverManager.getConnection(DBMS_CONN_STRING, DBMS_USERNAME, DBMS_PASSWORD);
                PreparedStatement statement = con.prepareStatement(sqlStatement1)) {

            System.out.println(insertTeacher(statement, ""));

        } catch (SQLException ex) {

            // SQLException is actually a linked list of Exceptions
            while (ex != null) {
                System.out.println(ex.getSQLState());
                System.out.println(ex.getMessage());
                System.out.println(ex.getErrorCode());
                ex = ex.getNextException();
            }
        }
    }

    private static String insertTeacher(PreparedStatement statement, String arg) throws SQLException {

        StringBuilder insert = new StringBuilder();

        statement.setString(1, arg);

        try (ResultSet rs = statement.executeQuery()) {
            while (rs.next()) {
                insert.append(String.format("%d - %s, %s, %s%n", rs.getInt("address_id"),
                        rs.getString("address"), rs.getString("city"), rs.getString("district")));
            }
        }

        return insert.toString();
    }
    
}


