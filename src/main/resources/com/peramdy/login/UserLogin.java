package com.peramdy.login;

import com.peramdy.service.IUserService;
import com.peramdy.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Peramdy on 2017/2/7
 */
public class UserLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String userName=req.getParameter("userName");
        String passWords=req.getParameter("passWords");
        IUserService userService=new UserServiceImpl();
        Integer reslut= userService.login(userName,passWords);
        //        resp.sendRedirect("");   //从定向
        if(reslut==1){
            req.getRequestDispatcher("userIndex.jsp").forward(req,resp);//带参数传递
        }else{

        }
    }







}
