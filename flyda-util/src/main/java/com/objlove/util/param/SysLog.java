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
public class SysLog {

    private static final long serialVersionUID = 1L;

    /**
     * 日志id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 权限更新的类型：1部门 2用户 3权限模块 4权限 5角色 6角色用户关系 7角色权限关系
     */
    private Integer type;

    /**
     * 基于type后制定的对象id，比如用户、权限、角色表的主键
     */
    private Integer targetId;

    /**
     * 旧值
     */
    private String oldValue;

    /**
     * 新值
     */
    private String newValue;

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

    /**
     * 当前是否复原过：0没有 1复原过
     */
    private Integer status;


}
