package ra.academy;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {

        message = "Hello World!";
        System.out.println("Giai doan khởi tạo");

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       System.out.println("Xử lí yêu cầu gửi bằng phương thức Get");
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
            super.doPost(req,res);
    }

    Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse res) throw IOException{

    }
    public void destroy() {
        System.out.println("Trước khi tiêu huỷ servlet");
    }
}