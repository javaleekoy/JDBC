package servlet.com.peramdy.login;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import org.apache.log4j.spi.LoggerFactory;
import servlet.com.peramdy.service.IUserService;
import servlet.com.peramdy.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Peramdy on 2017/2/7
 */

@WebServlet("/userLogin")
public class UserLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String userName=req.getParameter("userName");
        String password=req.getParameter("password");
        IUserService userService=new UserServiceImpl();
        Integer reslut= userService.login(userName,password);
        //resp.sendRedirect("");   //从定向
        if(reslut==1){
            req.getRequestDispatcher("/userIndex.jsp").forward(req,resp);//带参数传递
        }else{
            resp.sendRedirect("/error.jsp");
        }
    }







}
