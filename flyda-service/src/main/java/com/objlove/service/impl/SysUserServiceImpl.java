package com.objlove.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.objlove.mapper.SysUserMapper;
import com.objlove.pojo.SysUser;
import com.objlove.service.ISysUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Hongdong Liao
 * @since 2020-03-12
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Override
    public SysUser getSysUserById(Long id) {
        return baseMapper.selectById(id);
    }

    @Override
    public List<SysUser> getSysUserList() {
        return baseMapper.getSysUserList();
    }
}
