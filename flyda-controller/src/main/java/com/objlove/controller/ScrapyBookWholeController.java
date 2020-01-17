package com.objlove.controller;


import com.objlove.pojo.ScrapyBookWhole;
import com.objlove.service.IScrapyBookWholeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

//    @Autowired
//    private ScrapyBookWholeMapper scrapyBookWholeMapper;

    @RequestMapping(value = "/getBookWholeById", method = RequestMethod.GET)
    @ResponseBody
    public Object getBookWholeById(@RequestParam(value = "id") Integer id) {
        logger.debug("this is a log test, debug");
        logger.info("this is a log test, info");
        ScrapyBookWhole whole = scrapyBookWholeService.getById(id);
        System.out.println(whole);
        return whole;
    }
}
