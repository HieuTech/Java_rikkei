package ra.academy;

import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "StudentServlet", value="/StudentServlet")
public class StudentServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{

        //lấy ra tham số từ client   index.jsp
        String name = req.getParamater(name:"name");
        int age = Integer.parseInt(req.getParameter(name:"age"));
        String id = req.getParameter(name:"id");
        //thực hiện nhiều yêu cầu
        String action = request.getParameter(name:"action");

        if(action != null){
            switch (action){
                case "ADD":
                    // thêm mới
                    //điều hướng sang trang thêm
                    break;
                case "DELETE":

                    break;

            }
        }

    }

    protected  void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
       //hỗ trợ utf-8
        req.setCharacterEncoding("UTF-8");
        String name = req.getParamater(name:"name");
        int age = Integer.parseInt(req.getParameter(name:"age"));
        System.out.println()
    }
}