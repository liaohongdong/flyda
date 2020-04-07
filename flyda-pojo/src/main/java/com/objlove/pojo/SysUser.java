package com.objlove.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import java.util.Date;

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
public class SysUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名称
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 用户所在部门id
     */
    private Integer deptId;

    /**
     * 状态：1正常 0冻结  2删除
     */
    private Integer status;

    /**
     * 用户备注
     */
    @NotBlank
    private String remark;

    /**
     * 最后操作的用户
     */
    private String operator;

    /**
     * 最后操作的时间
     */
    private Date operateTime;

    /**
     * 最后操作的ip
     */
    private String operateIp;


}
