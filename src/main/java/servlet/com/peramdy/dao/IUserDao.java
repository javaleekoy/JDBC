package servlet.com.peramdy.dao;

/**
 * Created by Peramdy on 2017/3/23.
 */
public interface IUserDao {

    /**
     *
     * @param userName
     * @param password
     * @return
     */
    public Integer login_mysql (String userName,String password);

    /**
     *
     * @param userName
     * @param password
     * @return
     *
     */
    public Integer login_redis(String userName,String password);

}
