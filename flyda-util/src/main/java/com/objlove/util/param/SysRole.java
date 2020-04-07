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
public class SysRole {

    private static final long serialVersionUID = 1L;

    /**
     * 角色id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色类型：1管理员 2其他
     */
    private Integer type;

    /**
     * 状态：1正常 2冻结
     */
    private Integer status;

    /**
     * 部门备注
     */
    private String remark;

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
