package com.objlove.util.param;

import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Hongdong Liao
 * @since 2020-03-12
 */
@Data
@ToString
public class SysDept {

    private Integer id;

    @NotBlank(message = "部门名称不允许为空")
    @Length(min = 2, max = 15, message = "部门长度为2-15")
    private String name;

    private Integer parentId;

    @NotNull(message = "部门顺序不允许为空")
    private Integer seq;

    @Length(max = 150, message = "备注长度最大150 ")
    private String remark;

}
