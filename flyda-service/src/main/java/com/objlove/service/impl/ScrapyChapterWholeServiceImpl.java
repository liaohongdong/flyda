package com.objlove.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.objlove.pojo.ScrapyChapterWhole;
import com.objlove.mapper.ScrapyChapterWholeMapper;
import com.objlove.service.IScrapyChapterWholeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Hongdong Liao
 * @since 2020-01-17
 */
@Service
public class ScrapyChapterWholeServiceImpl extends ServiceImpl<ScrapyChapterWholeMapper, ScrapyChapterWhole> implements IScrapyChapterWholeService {

    @Override
    public List<ScrapyChapterWhole> getByCid(Page<?> page, Long cid) {
        List<ScrapyChapterWhole> whole = baseMapper.getByCid(page, cid);
        return whole;
    }
}
