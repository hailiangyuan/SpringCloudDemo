package pro.yhl.user.service;

import pro.yhl.user.bean.UserInfo;

/**
 * 接口
 * @author YuanHaiLiang
 * @date 2018-11-13
 */
public interface UserService {

    /**
     * 新用户注册
     * @param account 账号
     * @param passWord 密码
     */
    boolean addUser(String account,String passWord);

    /**
     *  用户更新信息
     * @param userName  昵称
     * @param passWord 密码
     * @param imgUrl 头像
     */
    boolean updateUser(String account,String userName,String passWord,String imgUrl);

    /**
     * 添加好友时 根据账号查找用户
     * @param account 对方账号
     */
    UserInfo findUser(String account);

    /**
     * 用户验证
     * @param account  账号
     * @param passWord 密码
     */
    boolean verifyUser(String account,String passWord);

    /**
     * 用户注销
     * @param account 账号
     * @param passWord 密码（以防万一）
     */
    boolean deleteUser(String account,String passWord);
}
