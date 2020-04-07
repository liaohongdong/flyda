package com.objlove.util.param;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
public class SysUser {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名称
     */
    @NotBlank(message = "用户名称不能为空")
    private String username;

    /**
     * 用户密码
     */
    @NotBlank(message = "用户密码不能为空")
    private String password;

    /**
     * 手机号码
     */
    @NotBlank(message = "用户手机号码不能为空")
    private String phone;

    /**
     * 用户所在部门id
     */
    @NotNull(message = "用户所在部门id不能为空")
    private Integer deptId;

    /**
     * 状态：1正常 0冻结  2删除
     */
    @NotNull(message = "状态不能为空")
    private Integer status;

}
