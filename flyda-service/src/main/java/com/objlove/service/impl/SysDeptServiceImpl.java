package com.objlove.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.objlove.mapper.SysDeptMapper;
import com.objlove.pojo.SysDept;
import com.objlove.service.ISysDeptService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Hongdong Liao
 * @since 2020-03-12
 */
@Service
public class SysDeptServiceImpl extends ServiceImpl<SysDeptMapper, SysDept> implements ISysDeptService {
    @Override
    public boolean save(SysDept entity) {
        return super.save(entity);
    }
}
