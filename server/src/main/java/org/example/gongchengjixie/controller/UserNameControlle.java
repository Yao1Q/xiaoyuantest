package org.example.gongchengjixie.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.gongchengjixie.common.Result;
//import org.example.gongchengjixie.entity.Gongchengjixie;
import org.example.gongchengjixie.entity.Img;
import org.example.gongchengjixie.entity.NewsHighlights;
import org.example.gongchengjixie.entity.UserName;
import org.example.gongchengjixie.mapper.ImgMapper;
import org.example.gongchengjixie.mapper.NewsHighlightsMapper;
import org.example.gongchengjixie.mapper.UserNameMapper;
import org.example.gongchengjixie.service.UserNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/gongchengjixie")
public class UserNameControlle {
//    @Autowired
//    UserNameService userNameService;

    @Autowired
    ImgMapper imgMapper;

    @Autowired
    NewsHighlightsMapper newsHighlightsMapper;

    @Autowired
    UserNameMapper userNameMapper;

//    @GetMapping("/info")
//    public Result getInfo(Integer gongchengjixieId){
//        return Result.success(userNameService.getById(gongchengjixieId));
//    }
//
//    @PostMapping("/info")
//    public Result newInfo(UserName gongchengjixie){
//        return Result.success(userNameService.save(gongchengjixie));
//    }
//
//    @PutMapping("/info")
//    public Result updateInfo(UserName gongchengjixie){
//        return Result.success(userNameService.updateById(gongchengjixie));
//    }
//
//    @DeleteMapping("/info")
//    public Result deleteInfo(Integer gongchengjixieId){
//        userNameService.remove(gongchengjixieId);
//        return Result.success(null);
//    }
//
//    @GetMapping("/page")
//    public Result page(
//            @RequestParam(defaultValue = "1")Integer current,
//            @RequestParam(defaultValue = "10")Integer size,
//            UserName gongchengjixie
//                       ){
//        Page<UserName> page = new Page<>(current,size);
//
//        QueryWrapper<UserName> gongchengjixieQueryWrapper = new QueryWrapper<>();
//
//
//        return Result.success(userNameService.page(page,gongchengjixieQueryWrapper));
//    }

    @GetMapping("/homeimg")
    public Result homeimg(){
        List<Img> homeings = imgMapper.selectAll();
        System.out.println("打印："+homeings);
        return Result.success(homeings);
    }

    @GetMapping("/NewsHighlights")
    public Result NewsHighlights(){
        List<NewsHighlights> newsHighlights = newsHighlightsMapper.selectAll();
        System.out.println("打印："+newsHighlights);
        return Result.success(newsHighlights);
    }

    @PostMapping("/PostUser")
    public Result PostUser(UserName username){
        //查询该用户是否第一次进入
        List<UserName> usernames = userNameMapper.selectOne(username.getOpenid());
        System.out.println(usernames);
        if(usernames==null || usernames.size()!=0 ){
            System.out.println("老用户");
        }else {
            /**
             * 用uuid生成为id
             */
            String uuid = UUID.randomUUID().toString();
            System.out.println("uuid:"+uuid);
            List<String> user = new ArrayList();
            user.add(uuid);
            user.add(username.getName());
            user.add(username.getOpenid());
            user.add(username.getUserimg());
            user.add(null);
            System.out.println("List:"+user);
            userNameMapper.addUser(user);
        }
        return null;
    }
    @PostMapping("/AddImg")
    public Result AddImg(UserName username){
        //查询该用户是否第一次进入
        List<UserName> usernames = userNameMapper.selectOne(username.getOpenid());
        System.out.println(usernames);
        if(usernames==null || usernames.size()!=0 ){
            System.out.println("老用户");
        }else {
            /**
             * 用uuid生成为id
             */
            String uuid = UUID.randomUUID().toString();
            System.out.println("uuid:"+uuid);
            List<String> user = new ArrayList();
            user.add(uuid);
            user.add(username.getName());
            user.add(username.getOpenid());
            user.add(username.getUserimg());
            user.add(null);
            System.out.println("List:"+user);
            userNameMapper.addUser(user);
        }
        return null;
    }
}

