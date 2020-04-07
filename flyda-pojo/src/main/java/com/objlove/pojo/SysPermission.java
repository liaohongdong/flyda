package com.objlove.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SysPermission extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 权限id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 权限码
     */
    private String code;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 上级权限id
     */
    private Integer parentId;

    /**
     * 请求的url
     */
    private String url;

    /**
     * 类型：1菜单 2按钮 3其他
     */
    private Integer type;

    /**
     * 状态：1正常 0冻结
     */
    private Integer status;

    /**
     * 权限在当前层级下的顺序
     */
    private Integer seq;

    /**
     * 权限备注
     */
    private String remark;

    /**
     * 权限层级
     */
    private String level;

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
