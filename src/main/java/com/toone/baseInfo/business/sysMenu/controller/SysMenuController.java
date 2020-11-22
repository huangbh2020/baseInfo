package com.toone.baseInfo.business.sysMenu.controller;


import com.toone.baseInfo.utils.ResponseEntity;
import com.toone.baseInfo.utils.ResponseUtil;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 菜单 前端控制器
 * </p>
 *
 * @author huanghb
 * @since 2020-11-19
 */
@RestController
@RequestMapping("/sysMenu")
public class SysMenuController {

    @RequestMapping("/getSysMenu")
    public ResponseEntity getSysMenu(){
        return ResponseUtil.success("1");
    }

}

