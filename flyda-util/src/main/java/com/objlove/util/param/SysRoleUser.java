package com.objlove.util.param;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Hongdong Liao
 * @since 2020-03-12
 */
@Data
@Accessors(chain = true)
public class SysRoleUser {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 最后操作的用户
     */
    private String operator;

    /**
     * 最后操作的时间
     */
    private LocalDateTime operateTime;

    /**
     * 最后操作的ip
     */
    private String operateIp;


}
