package servlet.com.peramdy.login;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Peramdy on 2017/1/23.
 */
public class LoginAction extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String userName=request.getParameter("userName");
        String passWord=request.getParameter("passWord");

//        request.setAttribute("userName",userName);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
