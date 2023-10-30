package org.example.gongchengjixie.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.example.gongchengjixie.common.Result;
import org.example.gongchengjixie.common.SystemException;
import org.example.gongchengjixie.entity.User;
import org.example.gongchengjixie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/system")
public class SystemController {

    @Autowired
    UserService userService;

    @Autowired
    HttpSession session;

    @PutMapping("/login")
    public Result login(String account, String password){
        if (!StringUtils.hasLength(account)){
            throw new SystemException("账户必须输入");
        }

        if (!StringUtils.hasLength(password)){
            throw new SystemException("密码必须输入");
        }

        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("account",account);

        List<User> users = userService.list(userQueryWrapper);

        if (null == users || users.size() == 0){
            throw new SystemException("账号不存在 请联系开发者");
        }else if (users.size() > 1){
            throw new SystemException("账户存在问题 请联系开发者");
        }

        User user = users.remove(0);

        if (!password.equals(user.getPassword())){
            throw new SystemException("密码错误");
        }

        session.setAttribute("CURRENT",user);

        return Result.success(user);
    }
}
