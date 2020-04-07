package com.objlove.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.objlove.pojo.ScrapyBookWhole;
import com.objlove.pojo.ScrapyChapterWhole;
import com.objlove.service.IScrapyBookWholeService;
import com.objlove.service.IScrapyChapterWholeService;
import com.objlove.util.dto.JsonData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Hongdong Liao
 * @since 2020-01-16
 */
@RestController
@RequestMapping("/ScrapyBookWhole")
public class ScrapyBookWholeController extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private IScrapyBookWholeService scrapyBookWholeService;

    @Autowired
    private IScrapyChapterWholeService scrapyChapterWholeService;

    @RequestMapping(value = "/getBookWholeById", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getBookWholeById(@RequestParam("id") Integer id,
                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                     @RequestParam(value = "PageSize", defaultValue = "10") Integer pageSize) {
        ScrapyBookWhole whole = scrapyBookWholeService.getById(id);
        String cid = whole.getBookUrl().split("/")[2];
        List<ScrapyChapterWhole> chapterWhole = scrapyChapterWholeService.getByCid(new Page<>(pageNum, pageSize), Long.valueOf(cid));
        whole.setChapterWhole(chapterWhole);
        return JsonData.build(whole, "查询成功", 200);
    }
}
