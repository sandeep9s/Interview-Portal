
import java.sql.*;

public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/interview_portal";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
