package com.objlove.controller;

import com.objlove.service.ISysUserService;
import com.objlove.service.impl.SysUserServiceImpl;
import com.objlove.util.ApplicationContextHelper;
import com.objlove.util.dto.JsonData;
import com.objlove.util.enums.HttpStatusCode;
import com.objlove.util.param.SysUser;
import com.objlove.web.config.BeanValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Hongdong Liao
 * @since 2020-03-12
 */
@Controller
@RequestMapping("/SysUser/sys-user")
@Slf4j
public class SysUserController extends BaseController {

    @Autowired
    private SysUserServiceImpl sysUserService;

    @RequestMapping("/getSysUserById")
    @ResponseBody
    public JsonData getSysUserById(@RequestParam("id") Long id) {
//        SysUser sysUser = sysUserService.getSysUserById(id);
//        return JsonData.build(sysUser, "获取成功", HttpStatusCode.OK.getCode());
//        return JsonData.build(sysUser, "获取成功", HttpStatusCode.OK.getCode());
        return JsonData.build(new int[]{1, 2, 3}, "获取成功", HttpStatusCode.OK.getCode());
//        int x = 1 / 0;
//        return JsonData.build("错误", 500);
    }

    @RequestMapping("/getSysUserList")
//    @PutMapping("/getSysUserList")
    @ResponseBody
    public JsonData getSysUserList(SysUser user) {
        JsonData check = BeanValidator.check(user);
        if (check != null) return check;
        ISysUserService sysUserService = ApplicationContextHelper.popBean(ISysUserService.class);
        List<?> sysUserList = sysUserService.getSysUserList();
        return JsonData.build(sysUserList, "获取成功", 200);
    }

}
