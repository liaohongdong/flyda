package com.objlove.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.objlove.pojo.ScrapyChapterWhole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Hongdong Liao
 * @since 2020-01-17
 */
public interface IScrapyChapterWholeService extends IService<ScrapyChapterWhole> {

    List<ScrapyChapterWhole> getByCid(Page<?> page, Long cid);

}
