package org.example.gongchengjixie.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserAddImg implements Serializable {

    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;
    private String account;
    private String password;
}
