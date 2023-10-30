package org.example.gongchengjixie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.gongchengjixie.entity.User;
import org.example.gongchengjixie.mapper.UserMapper;
import org.example.gongchengjixie.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}
