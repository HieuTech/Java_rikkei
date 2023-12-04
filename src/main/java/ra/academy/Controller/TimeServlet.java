package ra.academy;

import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "timeServlet", value="/time-servlet")
public class TimeServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        LocalDateTime localDateTime = LocalDateTime.now();

        res.setContentType('text/html');

        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<h1>"+localDateTime+"</h1>");
        out.println("</body></html>");

    }

    protected  void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{

    }
}