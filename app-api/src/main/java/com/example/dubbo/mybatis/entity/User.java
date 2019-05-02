package com.example.dubbo.mybatis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Ciwei
 * @since 2019-05-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User extends Model<User> {

private static final long serialVersionUID=1L;

    /**
     * 用户id
     */
    @TableId(value = "userId", type = IdType.AUTO)
    private Integer userId;

    /**
     * 用户名
     */
    @TableField("userName")
    private String userName;


    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

}
