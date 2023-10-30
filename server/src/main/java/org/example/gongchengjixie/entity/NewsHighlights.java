package org.example.gongchengjixie.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class NewsHighlights implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String theme;

    private String content;

    private String img;

    private Integer state;


}