package servlet.com.peramdy.utils;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Peramdy on 2017/2/8.
 */
public class PropertiesUtils {

    private static Logger logger=Logger.getLogger(PropertiesUtils.class);

    public static Object getValue(String key, String fileName) {
        Object value = null;
        InputStream inputStream = null;
        Properties properties = new Properties();
//      InputStream inputStream=PropertiesUtils.class.getClassLoader().getResourceAsStream(fileName);
        try {
            File file=new File(fileName);
            if(!file.exists())
                logger.info("文件不存在！fileName="+fileName);
            inputStream = new FileInputStream(file);
            properties.load(inputStream);
            value = properties.get(key);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("读取文件异常：",e);
        } finally {
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
                logger.error("关闭流异常：",e);
            }
        }
        return value;
    }

}
