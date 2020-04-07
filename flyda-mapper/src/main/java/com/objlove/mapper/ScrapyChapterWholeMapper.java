package com.objlove.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.objlove.pojo.ScrapyChapterWhole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Hongdong Liao
 * @since 2020-01-17
 */
@Mapper
public interface ScrapyChapterWholeMapper extends BaseMapper<ScrapyChapterWhole> {

    List<ScrapyChapterWhole> getByCid(Page<?> page, Long cid);

}
