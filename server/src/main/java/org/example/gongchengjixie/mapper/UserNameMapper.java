package org.example.gongchengjixie.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//import org.example.gongchengjixie.entity.Gongchengjixie;
import org.apache.ibatis.annotations.Param;
import org.example.gongchengjixie.entity.Img;
import org.example.gongchengjixie.entity.UserName;

import java.util.List;

public interface UserNameMapper extends BaseMapper<UserName> {

    List<UserName> selectOne(@Param("openid") String openid);

    void addUser(@Param("user") List<String> user);
}
