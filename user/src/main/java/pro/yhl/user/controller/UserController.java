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
        return  userService.addUser(account, passWord);
    }

    @PostMapping(value = "/updateUser")
    public boolean updateUser(String userName, String passWord, String imgUrl) {
        return userService.updateUser(userName,userName,passWord,imgUrl);
    }

    @GetMapping(value = "/findUser")
    public UserInfo findUser(String account) {
        return userService.findUser(account);
    }

    @GetMapping(value = "/verifyUser")
    public boolean verifyUser(String account, String passWord) {
        return userService.verifyUser(account, passWord);
    }

    @PostMapping(value = "/deleteUser")
    public boolean deleteUser(String account, String passWord) {
        return userService.deleteUser(account, passWord);
    }
}
