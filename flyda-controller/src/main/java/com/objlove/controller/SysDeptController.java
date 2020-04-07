package com.objlove.controller;


import com.objlove.pojo.SysDept;
import com.objlove.util.dto.JsonData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Hongdong Liao
 * @since 2020-03-12
 */
@Controller
@RequestMapping("/SysDept")
@Slf4j
public class SysDeptController extends BaseController {

    @PutMapping(value = "/saveDept")
    @ResponseBody
    public JsonData saveSysDept(SysDept dept) {
        return JsonData.build("保存成功", 200);
    }
}
