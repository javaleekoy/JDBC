package servlet.com.peramdy.utils;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.File;

/**
 * Created by Peramdy on 2017/3/30.
 */
public class Log4jInit extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        String log4jLocation = config.getInitParameter("localLog4j");
        ServletContext servletContext = config.getServletContext();
        if (log4jLocation == null) {
            System.err.println("*** 没有localLog4j初始化的文件,所以使用BasicConfigurator初始化");
            BasicConfigurator.configure();
        }else{
            String webAppPath = servletContext.getRealPath("/");
            String log4jProp = webAppPath + log4jLocation;
            File yoMamaYesThisSaysYoMama = new File(log4jProp);
            if (yoMamaYesThisSaysYoMama.exists()) {
                System.out.println("使用: " + log4jProp+"初始化日志设置信息");
                PropertyConfigurator.configure(log4jProp);
            } else {
                System.err.println("*** " + log4jProp + " 文件没有找到， 所以使用 BasicConfigurator初始化");
                BasicConfigurator.configure();
            }
        }
        super.init(config);
    }
}
