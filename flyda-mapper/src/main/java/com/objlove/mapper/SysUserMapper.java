package com.objlove.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.objlove.pojo.SysUser;

import java.util.List;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Hongdong Liao
 * @since 2020-03-12
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
    List<SysUser> getSysUserList();
}
