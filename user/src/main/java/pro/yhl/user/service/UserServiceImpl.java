package pro.yhl.user.service;

import org.springframework.stereotype.Service;
import pro.yhl.user.bean.UserInfo;
import pro.yhl.user.dao.UserDao;

import javax.annotation.Resource;

/**
 * 用户操作类
 * @author YuanHaiLiang
 * @date 2018-11-13
 */
@Service
public class UserServiceImpl implements UserService{

    /**
     * @ Autowired注解是按照类型（byType）装配依赖对象，默认情况下它要求依赖对象必须存在
     * @ Qualifier 注解 安装名称注入，消除歧义
     * 或者使用 @Resource默认按照ByName自动注入，可替代 @ Autowired+@ Qualifier
     */
    @Resource
    private UserDao userDao;

    @Override
    public boolean addUser(String account, String passWord) {
        return userDao.addUser(account, passWord);
    }

    @Override
    public boolean updateUser(String account,String userName, String passWord, String imgUrl) {
        return userDao.updateUser(account,userName,passWord,imgUrl);
    }

    @Override
    public UserInfo findUser(String account) {
        return userDao.findUser(account);
    }

    @Override
    public boolean verifyUser(String account, String passWord) {
        return userDao.verifyUser(account, passWord);
    }

    @Override
    public boolean deleteUser(String account, String passWord) {
        return userDao.deleteUser(account, passWord);
    }
}
