package pro.yhl.user.bean;

/**
 * 用户信息实体类
 *
 * @author YuanHaiLiang
 * @date 2018-11-13
 */
public class UserInfo {
    /**
     * 账号
     */
    private String account;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String passWord;
    /**
     * 头像地址
     */
    private String imgUrl;

    public UserInfo(String account, String userName, String passWord, String imgUrl) {
        this.account = account;
        this.userName = userName;
        this.passWord = passWord;
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "account='" + account + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
