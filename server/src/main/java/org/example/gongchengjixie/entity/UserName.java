package org.example.gongchengjixie.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserName implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private String id;
    private String name;
    private String openid;
    private String userimg;
    private String tel;



}
