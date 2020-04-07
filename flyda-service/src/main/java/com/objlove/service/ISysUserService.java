package com.objlove.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.objlove.pojo.SysUser;

import java.util.List;


/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Hongdong Liao
 * @since 2020-03-12
 */
public interface ISysUserService extends IService<SysUser> {

    SysUser getSysUserById(Long id);

    List<SysUser> getSysUserList();
}
