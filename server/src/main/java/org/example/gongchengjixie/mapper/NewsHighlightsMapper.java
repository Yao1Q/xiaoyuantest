package org.example.gongchengjixie.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.gongchengjixie.entity.Img;
import org.example.gongchengjixie.entity.NewsHighlights;

import java.util.List;
//import org.example.gongchengjixie.entity.Siji;

public interface NewsHighlightsMapper extends BaseMapper<NewsHighlights> {

    List<NewsHighlights> selectAll();

}
