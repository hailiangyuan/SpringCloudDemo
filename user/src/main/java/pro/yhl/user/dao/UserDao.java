package pro.yhl.user.dao;

import org.apache.ibatis.annotations.*;
import pro.yhl.user.bean.UserInfo;

/**
 * @author YuanHaiLiang
 * @date 2018-11-13
 */
@Mapper
public interface UserDao {

    /**
     * 新用户注册
     * @param account 账号
     * @param passWord 密码
     * @return true=SUCCESS||false = FAILURE
     */

    @Insert("INSTET INTO USERINFO VALUES(#{account},#{account},#{passWord},NULL)")
    boolean addUser(String account,String passWord);

    /**
     * 用户更新信息
     * @param userName  昵称
     * @param passWord 密码
     * @param imgUrl 头像
     * @return true=SUCCESS||false = FAILURE
     */
    @Update("UPDATE USERINFO SET userName = #{userName} WHERE ACCOUNT =#{account}")
    boolean updateUser(String account, String userName,String passWord,String imgUrl);

    /**
     * 添加好友时 根据账号查找用户
     * @param account 对方账号信息
     * @return UserInfo
     */
    @Results({
            @Result(property = "account",column = "account"),
            @Result(property = "userName",column = "userName"),
            @Result(property = "imgUrl",column = "imgUrl"),
    })
    @Select("SELECT * FROM USERINFO WHERE ACCOUNT=#{account} ")
    UserInfo findUser(String account);

    /**
     * 用户验证
     * @param account  账号
     * @param passWord 密码
     * @return true=SUCCESS||false = FAILURE
     */
    @Select("SELECT * FROM USERINFO WHERE account=#{account} AND passWord=#{passWord}")
    boolean verifyUser(String account,String passWord);

    /**
     * 用户注销
     * @param account 账号
     * @param passWord 密码（以防万一）
     * @return true=SUCCESS||false = FAILURE
     */
    boolean deleteUser(String account,String passWord);
}
