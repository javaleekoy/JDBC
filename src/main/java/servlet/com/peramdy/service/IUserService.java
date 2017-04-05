package servlet.com.peramdy.service;

/**
 * Created by Peramdy on 2017/2/7.
 */
public interface IUserService {

    /**
     * @Description 登录
     * @param userName
     * @param password
     * @return 0 密码错误 1 成功 2用户名不存在
     *
     */
    public Integer login(String userName,String password);

}
