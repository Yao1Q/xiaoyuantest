package org.example.gongchengjixie.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.gongchengjixie.entity.Img;

import java.util.List;
//import org.example.gongchengjixie.entity.Siji;

public interface ImgMapper extends BaseMapper<Img> {

    List<Img> selectAll();

}
