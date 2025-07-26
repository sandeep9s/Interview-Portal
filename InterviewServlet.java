
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class InterviewServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String participant = request.getParameter("participant");
        String start = request.getParameter("start");
        String end = request.getParameter("end");

        try (Connection conn = DBUtil.getConnection()) {
            String sql = "INSERT INTO interviews (participant, start_time, end_time) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, participant);
            stmt.setString(2, start);
            stmt.setString(3, end);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect("index.html");
    }
}
