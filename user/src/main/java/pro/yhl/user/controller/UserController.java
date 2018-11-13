package pro.yhl.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.yhl.user.bean.UserInfo;
import pro.yhl.user.service.UserService;

/**
 * 对外开发的 用户接口
 * @author YuanHaiLiang
 * @date 2018-11-13
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PutMapping(value = "/addUser")
    public boolean addUser(String account, String passWord) {
        return false;
    }

    @PostMapping(value = "/updateUser")
    public boolean updateUser(String userName, String passWord, String imgUrl) {
        return false;
    }

    @GetMapping(value = "/findUser")
    public UserInfo findUser(String account) {
        return null;
    }

    @GetMapping(value = "/verifyUser")
    public boolean verifyUser(String account, String passWord) {
        return false;
    }

    @PostMapping(value = "/deleteUser")
    public boolean deleteUser(String account, String passWord) {
        return false;
    }
}
