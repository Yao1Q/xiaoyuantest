//package org.example.gongchengjixie.controller;
//
//
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import org.example.gongchengjixie.common.Result;
//import org.example.gongchengjixie.entity.Siji;
//import org.example.gongchengjixie.service.SijiService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/siji")
//public class SijiControlle {
//    @Autowired
//    SijiService sijiService;
//
//    @GetMapping("/info")
//    public Result getInfo(Integer sijiId){
//        return Result.success(sijiService.getById(sijiId));
//    }
//
//    @PostMapping("/info")
//    public Result newInfo(Siji siji){
//        return Result.success(sijiService.save(siji));
//    }
//
//    @PutMapping("/info")
//    public Result updateInfo(Siji siji){
//        return Result.success(sijiService.updateById(siji));
//    }
//
//    @DeleteMapping("/info")
//    public Result deleteInfo(Integer sijiId){
//        sijiService.remove(sijiId);
//        return Result.success(null);
//    }
//
//    @GetMapping("/page")
//    public Result page(
//            @RequestParam(defaultValue = "1")Integer current,
//            @RequestParam(defaultValue = "10")Integer size,
//            Siji siji
//                       ){
//        Page<Siji> page = new Page<>(current,size);
//
//        QueryWrapper<Siji> sijiQueryWrapper = new QueryWrapper<>();
//
//        if (StringUtils.hasLength(siji.getName())){
//            sijiQueryWrapper.like("name",siji.getName());
//        }
//
//        if(null != siji.getZhuangtai()){
//            sijiQueryWrapper.like("zhuangtai",siji.getZhuangtai());
//        }
//
//
//        return Result.success(sijiService.page(page,sijiQueryWrapper));
//    }
//}
//
