import servlet.com.peramdy.utils.PropertiesUtils;

/**
 * Created by Peramdy on 2017/3/31.
 */
public class Test {
    @org.junit.Test
    public void testOne(){
        String realPath=System.getProperty("user.dir");
        String host= (String)PropertiesUtils.getValue("host", realPath+"/target/classes/conf/redis.properties");
        System.out.println(host);
    }

}
